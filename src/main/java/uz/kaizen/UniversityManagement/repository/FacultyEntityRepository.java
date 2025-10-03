package uz.kaizen.UniversityManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.kaizen.UniversityManagement.entity.FacultyEntity;

import java.util.List;
import java.util.UUID;

public interface FacultyEntityRepository extends JpaRepository<FacultyEntity, UUID> {
    List<FacultyEntity> findAllByFacultyName(String facultyName);
}