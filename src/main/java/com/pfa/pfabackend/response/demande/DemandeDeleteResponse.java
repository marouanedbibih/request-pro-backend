package com.pfa.pfabackend.response.demande;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DemandeDeleteResponse {
    private String success;
    private List<String> errors ;
    private String redirectTo;
}
