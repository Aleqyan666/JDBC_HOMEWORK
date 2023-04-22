package org.example;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Entity
@Table (name = "companies")
@Getter @Setter @ToString
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int companyId;
    private String name;
    private Date foundDate;

    public Company(int companyId, String name, Date foundDate) {
        this.companyId = companyId;
        this.name = name;
        this.foundDate = foundDate;
    }

    public Company(String name, Date foundDate) {
        this.name = name;
        this.foundDate = foundDate;
    }

    public Company() {
    }


}
