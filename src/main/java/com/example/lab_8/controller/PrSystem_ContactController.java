package com.example.lab_8.controller;

import com.example.lab_8.model.PrSystem_Contact;
import com.example.lab_8.repository.PrSystem_ContactRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prsystem-contacts")
public class PrSystem_ContactController {
    private final PrSystem_ContactRepository prSystemContactRepository;

    // Constructor injection
    public PrSystem_ContactController(PrSystem_ContactRepository prSystemContactRepository) {
        this.prSystemContactRepository = prSystemContactRepository;
    }

    @GetMapping
    public List<PrSystem_Contact> getAllContacts() {
        return prSystemContactRepository.findAll();
    }

    @PostMapping
    public PrSystem_Contact createContact(@RequestBody PrSystem_Contact contact) {
        return prSystemContactRepository.save(contact);
    }

}
