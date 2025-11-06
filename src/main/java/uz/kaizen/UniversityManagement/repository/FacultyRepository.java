package uz.kaizen.UniversityManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.kaizen.UniversityManagement.entity.Faculty;

import java.util.List;
import java.util.UUID;

public interface FacultyRepository extends JpaRepository<Faculty, UUID> {
    List<Faculty> findAllByFacultyName(String facultyName);
}