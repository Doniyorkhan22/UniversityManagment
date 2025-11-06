package uz.kaizen.UniversityManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;
    @Column(nullable = false,name = "region")
    private String region;
    @Column(nullable = false,name = "district")
    private String district;
    @Column(nullable = false,name = "street")
    private String street;
    @Column(nullable = false,name = "home_number")
    private String homeNumber;
}
