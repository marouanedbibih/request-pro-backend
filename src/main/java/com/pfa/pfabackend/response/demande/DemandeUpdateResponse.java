package com.pfa.pfabackend.response.demande;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DemandeUpdateResponse {
    private String success;
    private String redirectTo;
    private List<String> errors;
}
