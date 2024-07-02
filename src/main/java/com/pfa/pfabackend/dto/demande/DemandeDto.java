package com.pfa.pfabackend.dto.demande;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DemandeDto {
    private long id;
    private String description;
    private Date date;
    private String status;
    private String type;
    private long clientId;
    private String clientName;



}

