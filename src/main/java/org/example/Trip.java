package org.example;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
//@Getter @Setter @ToString
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name = "trip")

public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tripId;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int companyId;
    private String airplane;
    private String townFrom;
    private String townTo;
    private Timestamp timeOut;
    private Timestamp timeIn;
    @ManyToMany(mappedBy = "trip")
    private Set<Passenger> passengers;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "trip_id", nullable = false)
    private Company company;


    public Trip(int triId, int companyId, String airplane, String townFrom, String townTo, Timestamp timeOut, Timestamp timeIn) {
        this.tripId = triId;
    }
}
