package uz.kaizen.UniversityManagement.service.servicePlane;

import uz.kaizen.UniversityManagement.dto.AddressDto;
import uz.kaizen.UniversityManagement.dto.UniversityDto;
import uz.kaizen.UniversityManagement.entity.Address;
import uz.kaizen.UniversityManagement.entity.University;

import java.util.List;
import java.util.UUID;

public interface UniversityService {

    University add(UniversityDto universityDto);

    List<University> getAll();
    University getById(UUID uuid);
    University update(UniversityDto universityDto);
    void delete(UUID uuid);
}
