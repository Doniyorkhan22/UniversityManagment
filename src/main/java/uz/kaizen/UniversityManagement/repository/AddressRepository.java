package uz.kaizen.UniversityManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.kaizen.UniversityManagement.entity.Address;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}