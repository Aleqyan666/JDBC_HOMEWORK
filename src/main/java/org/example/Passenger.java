package org.example;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "passengers")
@Data
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id",referencedColumnName = "id",nullable = false)
    private Address address;
    @ManyToMany
    @JoinTable(
            name = "pass_in_trip",
            joinColumns = {@JoinColumn(name = "psg_id")},
            inverseJoinColumns = {@JoinColumn(name = "trip_id")}
    )
    private List<Trip> trip = new ArrayList<Trip>();

    public Passenger(String name, String phone, int id) {
        this.name = name;
        this.phone = phone;
        this.id = id;
    }

    public Passenger(String name, String phone, String country, String city) {
        this.name = name;
        this.phone = phone;

    }

    public Passenger() {
    }

    public Passenger(int id) {
        this.id = id;
    }


}
