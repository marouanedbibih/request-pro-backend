package com.pfa.pfabackend.service;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pfa.pfabackend.dto.admin.AdminDTO;
import com.pfa.pfabackend.dto.user.UserDTO;
import com.pfa.pfabackend.model.Admin;
import com.pfa.pfabackend.model.User;
import com.pfa.pfabackend.repository.AdminRepository;
import com.pfa.pfabackend.repository.UserRepository;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminRepository adminRepository;
    private final UserRepository userRepository;


    public void saveAdmin(User user) {
        // Save user data
        userRepository.save(user);
        // Build client data
        Admin admin = Admin.builder()
                .user(user)
                .build();
        // Save client data
        adminRepository.save(admin);
    }

    public Admin findAdminById(long id) {
        Admin query = adminRepository.findById(id).orElse(null);
        if (query == null) {
            return null;
        }
        User user = User.builder()
                .id(query.getUser().getId())
                .firstname(query.getUser().getFirstname())
                .lastname(query.getUser().getLastname())
                .email(query.getUser().getEmail())
                .phone(query.getUser().getPhone())
                .role(query.getUser().getRole())
                .created_at(query.getUser().getCreated_at())
                .build();
        Admin admin = Admin.builder().id(query.getId()).user(user).build();
        return admin;
    }

    public void updateAdmin(long id,Admin admin){
        User user = admin.getUser();
        user.setUpdate_at(new Date());
        userRepository.save(user);
    }
    public boolean deleteAdmin(long id) {
        Admin admin = adminRepository.findById(id).orElse(null);
        if (admin != null) {
            adminRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Page<AdminDTO> getAdminsByPagination(Pageable pageable) {
        Page<Admin> admins = adminRepository.findAll(pageable);
        return admins.map(this::convertToDTO);
    }


    public AdminDTO convertToDTO(Admin admin) {
        User user = admin.getUser();
        UserDTO userDTO = UserDTO.builder()
                .id(user.getId())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .email(user.getEmail())
                .phone(user.getPhone())
                .role(user.getRole())
                .created_at(user.getCreated_at())
                .build();
        return AdminDTO.builder()
                .id(admin.getId())
                .user(userDTO)
                .build();
    }




}
