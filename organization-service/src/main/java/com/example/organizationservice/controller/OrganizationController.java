package com.example.organizationservice.controller;

import com.example.organizationservice.dto.OrganizationDto;
import com.example.organizationservice.service.OrganizationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/organizations")
@Tag(
        name = "Organization_Controller",
        description = "Organization_controller Exposes REST API"
)
public class OrganizationController {

    private OrganizationService organizationService;

    @Operation(
            summary = "Save Organization REST API",
            description = "Save is used to save Organization"
    )
    @ApiResponse(
            responseCode = "201",
            description = "CREATED"
    )
    @PostMapping
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto){
        OrganizationDto savedOrganizationDto = organizationService.saveOrganization(organizationDto);
        return  new ResponseEntity<>(savedOrganizationDto, HttpStatus.CREATED);
    }

    @Operation(
            summary = "Get Organization REST API",
            description = "Get is used to get Organization"
    )
    @ApiResponse(
            responseCode = "20",
            description = "OK"
    )
    @GetMapping("{code}")
    public ResponseEntity<OrganizationDto> getOrganizationByCode(@PathVariable("code") String organizationCode){
        OrganizationDto organizationDto = organizationService.getOrganizationByCode(organizationCode);
        return new ResponseEntity<>(organizationDto,HttpStatus.OK);
    }

}
