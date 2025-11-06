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
public class Student {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private UUID uuid;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private boolean gender;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @ManyToOne
    private Groups groupEntity;

}
