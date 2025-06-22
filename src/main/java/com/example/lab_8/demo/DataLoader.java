//package com.example.lab_8.demo;
//
//import com.example.lab_8.model.*;
//import com.example.lab_8.repository.*;
//import jakarta.transaction.Transactional;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Configuration
//public class DataLoader {
//
//    @Bean
//    @Transactional
//    public CommandLineRunner loadData(
//            EventRepository eventRepo,
//            GuestRepository guestRepo,
//            ConferenceRepository conferenceRepo,
//            ExhibitionRepository exhibitionRepo,
//            SpeakerRepository speakerRepo,
//            PrSystem_ContactRepository contactRepo,
//            AssociationRepository associationRepo,
//            DivisionRepository divisionRepo,
//            MemberRepository memberRepo
//    ) {
//        return args -> {
//
//            // Guests
//            Guest guest1 = new Guest("Alice", GuestStatus.ATTENDING);
//            Guest guest2 = new Guest("Bob", GuestStatus.NO_RESPONSE);
//            Guest guest3 = new Guest("Carol", GuestStatus.NOT_ATTENDING);
//            guestRepo.saveAll(List.of(guest1, guest2, guest3));
//
//            // Events
//            Event event1 = new Event("Tech Expo", LocalDate.of(2025, 7, 1), 3, "Berlin");
//            Event event2 = new Event("AI Summit", LocalDate.of(2025, 8, 12), 2, "Munich");
//            Event event3 = new Event("Innovation Week", LocalDate.of(2025, 9, 20), 5, "Hamburg");
//            event1.setGuests(List.of(guest1, guest2));
//            event2.setGuests(List.of(guest2, guest3));
//            event3.setGuests(List.of(guest1, guest3));
//            eventRepo.saveAll(List.of(event1, event2, event3));
//
//            // Conference (inherits Event)
////            Conference conf1 = new Conference();
////            conf1.setId(event1.getId());
////            conferenceRepo.save(conf1);
////
////            Conference conf2 = new Conference();
////            conf2.setId(event2.getId());
////            conferenceRepo.save(conf2);
////
////            Conference conf3 = new Conference();
////            conf3.setId(event3.getId());
////            conferenceRepo.save(conf3);
//
////            // Speakers
////            Speaker sp1 = new Speaker("Dr. Smith", 30, conf1);
////            Speaker sp2 = new Speaker("Dr. Jane", 45, conf2);
////            Speaker sp3 = new Speaker("Dr. Mike", 25, conf3);
////            speakerRepo.saveAll(List.of(sp1, sp2, sp3));
//
//            // Exhibition (inherits Event)
////            Exhibition ex1 = new Exhibition();
////            ex1.setId(event1.getId());
////            Exhibition ex2 = new Exhibition();
////            ex2.setId(event2.getId());
////            Exhibition ex3 = new Exhibition();
////            ex3.setId(event3.getId());
////            exhibitionRepo.saveAll(List.of(ex1, ex2, ex3));
//
//            // PR System Contacts
//            PrSystem_Contact c1 = new PrSystem_Contact("OpenAI", "PR Manager", "Jane", "Doe", "Marie", "Ms.");
//            PrSystem_Contact c2 = new PrSystem_Contact("Google", "Communications Lead", "John", "Smith", "", "Mr.");
//            PrSystem_Contact c3 = new PrSystem_Contact("Meta", "Media Officer", "Eve", "Adams", "L.", "Ms.");
//            contactRepo.saveAll(List.of(c1, c2, c3));
//
//            // Association and Division
//            Association a1 = new Association("Tech Association");
//            Association a2 = new Association("Science Union");
//            Association a3 = new Association("Innovators Group");
//            associationRepo.saveAll(List.of(a1, a2, a3));
//
//            Member m1 = new Member("Alice Blue", LocalDate.of(2025, 6, 1), MemberStatus.ACTIVE);
//            Member m2 = new Member("Bob Green", LocalDate.of(2024, 12, 15), MemberStatus.LAPSED);
//            Member m3 = new Member("Carol Red", LocalDate.of(2025, 1, 10), MemberStatus.ACTIVE);
//            memberRepo.saveAll(List.of(m1, m2, m3));
//
//            Division d1 = new Division("North Division", "Berlin", a1, m1);
//            Division d2 = new Division("South Division", "Munich", a2, m2);
//            Division d3 = new Division("East Division", "Hamburg", a3, m3);
//            divisionRepo.saveAll(List.of(d1, d2, d3));
//
//            m1.setDivision(d1);
//            m2.setDivision(d2);
//            m3.setDivision(d3);
//            memberRepo.saveAll(List.of(m1, m2, m3));
//        };
//    }
//}
