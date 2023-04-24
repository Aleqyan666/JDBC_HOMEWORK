package org.example;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Table (name = "companies")
@Data @AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int companyId;
    private String name;
    private Date foundDate;

    public Company(String name, Date foundDate) {
        this.name = name;
        this.foundDate = foundDate;
    }

}
