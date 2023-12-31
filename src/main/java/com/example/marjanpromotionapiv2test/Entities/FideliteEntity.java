package com.example.marjanpromotionapiv2test.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FideliteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(nullable = false)
    private String fideliteId ;
    @Column(nullable = false)
    private int points ;
    @ManyToOne
    @JoinColumn(name = "Caissier_id")
    private CaissierEntity caissierEntity ;
}
