package uz.kaizen.UniversityManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class UniversityEntity {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private UUID uuid;
    @Column(unique = true,nullable = false)
    private String universityName;
    @Column(nullable = true)
    private String universityShortName;
    @Column(nullable = false)
    private String universityCEO;

}
