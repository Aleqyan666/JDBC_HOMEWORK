package org.example;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
@Entity
@Getter @Setter @ToString
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

    public Trip(int tripId, int companyId, String airplane, String townFrom, String townTo, Timestamp timeOut, Timestamp timeIn) {
        this.tripId = tripId;
        this.companyId = companyId;
        this.airplane = airplane;
        this.townFrom = townFrom;
        this.townTo = townTo;
        this.timeOut = timeOut;
        this.timeIn = timeIn;
    }

    public Trip() {
    }

    public Trip(int triId) {
        this.tripId = triId;
    }
}
