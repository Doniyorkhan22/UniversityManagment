package uz.kaizen.UniversityManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.kaizen.UniversityManagement.entity.University;

import java.util.UUID;

public interface UniversityRepository extends JpaRepository<University, UUID> {
}