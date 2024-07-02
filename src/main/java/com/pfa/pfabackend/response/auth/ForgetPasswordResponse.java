package com.pfa.pfabackend.response.auth;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ForgetPasswordResponse {
    private String success;
    private List<String> errors ;
    private String redirectTo;

}
