package com.example.marjanpromotionapiv2test.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name = "")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class AdminCentreEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String adminCentreId ;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String encryptPassword;

}