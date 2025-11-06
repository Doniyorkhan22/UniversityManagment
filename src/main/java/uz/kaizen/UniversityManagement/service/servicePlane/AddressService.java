package uz.kaizen.UniversityManagement.service.servicePlane;

import uz.kaizen.UniversityManagement.dto.AddressDto;
import uz.kaizen.UniversityManagement.entity.Address;

import java.util.List;
import java.util.UUID;

public interface AddressService {

    Address add(AddressDto addressDto);

    List<Address> getAll();
    Address getById(UUID uuid);
    Address update(AddressDto addressDto);
    void delete(UUID uuid);
}
