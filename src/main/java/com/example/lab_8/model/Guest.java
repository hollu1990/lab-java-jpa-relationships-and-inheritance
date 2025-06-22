package com.example.lab_8.model;

import jakarta.persistence.*;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Guest(String bob, GuestStatus guestStatus) {
    }

    public Guest() {

    }

    public enum Status {
        ATTENDING, NOT_ATTENDING, NO_RESPONSE
    }
}
