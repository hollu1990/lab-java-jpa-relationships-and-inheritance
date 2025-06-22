package com.example.lab_8.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrSystem_Name {
    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;


}
