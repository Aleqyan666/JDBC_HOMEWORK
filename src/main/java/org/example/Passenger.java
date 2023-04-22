package org.example;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "passengers")
@Getter @Setter  @ToString
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String phone;
    private String country;
    private String city;

    public Passenger(String name, String phone, String country, String city, int id) {
        this.name = name;
        this.phone = phone;
        this.country = country;
        this.city = city;
        this.id = id;
    }

    public Passenger(String name, String phone, String country, String city) {
        this.name = name;
        this.phone = phone;
        this.country = country;
        this.city = city;
    }

    public Passenger() {
    }

    public Passenger(int id) {
        this.id = id;
    }


    }
