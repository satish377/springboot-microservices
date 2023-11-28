package com.example.organizationservice.dto;

import jakarta.persistence.Column;
import jakarta.persistence.NamedEntityGraph;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDto {
    private Long id;
    private  String organizationName;
    private String organizationDescription;
    private String organizationCode;
    private String getOrganizationCreatedDate;
}
