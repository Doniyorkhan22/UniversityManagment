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
public class StudentEntity {
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
    private GroupEntity groupEntity;
    @ManyToOne
    private FacultyEntity facultyEntity;
    @ManyToOne
    private UniversityEntity universityEntity;
}
