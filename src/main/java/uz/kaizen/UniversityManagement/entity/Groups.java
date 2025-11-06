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
public class Groups {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private UUID uuid;
    @Column(nullable = false)
    private String groupName;
    @Column(nullable = false)
    private String groupOwner;
    @ManyToOne
    private Faculty facultyEntity;


}
