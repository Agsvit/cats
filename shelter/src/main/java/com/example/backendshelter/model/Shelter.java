package com.example.backendshelter.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Shelter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int capacity;
    @Enumerated
    private ShelterLocation shelterLocation;

    @OneToMany(mappedBy = "shelter")
    private List<Pet> pets;
}
