package com.pfa.pfabackend.request.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ForgetPasswordRequest {
    @Email(message = "Email should be valid")
    @NotBlank(message = "Email cannot be empty")
    private String email;

}
