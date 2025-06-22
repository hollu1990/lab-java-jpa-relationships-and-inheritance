package com.example.lab_8.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrSystem_Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String title;

    @Embedded
    private PrSystem_Name prSystem_Name;

    public PrSystem_Contact(String openAI, String prManager, String jane, String doe, String marie, String s) {
    }
}
