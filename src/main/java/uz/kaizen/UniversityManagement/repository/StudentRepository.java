package uz.kaizen.UniversityManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.kaizen.UniversityManagement.entity.Student;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
}