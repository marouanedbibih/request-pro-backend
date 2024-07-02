package com.pfa.pfabackend.dto.admin;

import com.pfa.pfabackend.dto.user.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminDTO {
    private long id;
    private UserDTO user;
}
