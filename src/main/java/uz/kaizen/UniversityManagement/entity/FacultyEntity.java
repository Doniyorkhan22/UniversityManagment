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
public class FacultyEntity {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private UUID uuid;
    @Column(nullable = false)
    private String facultyName;
    @Column(nullable = false)
    private String facultyCEO;
    @ManyToOne
    private UniversityEntity universityEntity;
}
