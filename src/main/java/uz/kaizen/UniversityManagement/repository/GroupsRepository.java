package uz.kaizen.UniversityManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.kaizen.UniversityManagement.entity.Groups;

import java.util.UUID;

public interface GroupsRepository extends JpaRepository<Groups, UUID> {
}