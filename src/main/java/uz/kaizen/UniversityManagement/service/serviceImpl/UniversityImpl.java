package uz.kaizen.UniversityManagement.service.serviceImpl;

import org.springframework.stereotype.Service;
import uz.kaizen.UniversityManagement.dto.AddressDto;
import uz.kaizen.UniversityManagement.dto.UniversityDto;
import uz.kaizen.UniversityManagement.entity.Address;
import uz.kaizen.UniversityManagement.entity.University;
import uz.kaizen.UniversityManagement.repository.AddressRepository;
import uz.kaizen.UniversityManagement.repository.UniversityRepository;
import uz.kaizen.UniversityManagement.service.servicePlane.AddressService;
import uz.kaizen.UniversityManagement.service.servicePlane.UniversityService;

import java.util.List;
import java.util.UUID;

@Service
public class UniversityImpl implements UniversityService {

    private final AddressRepository addressRepository;
    private final UniversityRepository universityRepository;

    public UniversityImpl(AddressRepository addressRepository,
                          UniversityRepository universityRepository) {
        this.addressRepository = addressRepository;
        this.universityRepository = universityRepository;
    }

    @Override
    public University add(UniversityDto universityDto) {
        Address address = addressRepository.findById(universityDto.getAddressUuid()).orElseThrow();
        University university=new University(
                null,
                universityDto.getUniversityName(),
                universityDto.getUniversityShortName(),
                universityDto.getUniversityCEO(),
                address

        );
        return universityRepository.save(university);
    }

    @Override
    public List<University> getAll() {
        return universityRepository.findAll();
    }

    @Override
    public University getById(UUID uuid) {
        return null;
    }

    @Override
    public University update(UniversityDto universityDto) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }
}
