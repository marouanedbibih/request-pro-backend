package com.pfa.pfabackend.response.admin;

import java.util.List;

import com.pfa.pfabackend.dto.admin.AdminDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminPageResponse {
    private List<AdminDTO> admins;
    private int currentPage;
    private int totalPages;
}
