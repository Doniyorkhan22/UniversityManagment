package uz.kaizen.UniversityManagement.service.serviceImpl;

import org.springframework.stereotype.Service;
import uz.kaizen.UniversityManagement.dto.AddressDto;
import uz.kaizen.UniversityManagement.entity.Address;
import uz.kaizen.UniversityManagement.repository.AddressRepository;
import uz.kaizen.UniversityManagement.service.servicePlane.AddressService;

import java.util.List;
import java.util.UUID;
@Service
public class AddressImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address add(AddressDto addressDto) {
        Address address=new Address(
                null,
                addressDto.getRegion(),
                addressDto.getDistrict(),
                addressDto.getStreet(),
                addressDto.getHomeNumber()
        );
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAll() {

        return addressRepository.findAll();
    }

    @Override
    public Address getById(UUID uuid) {
        return null;
    }

    @Override
    public Address update(AddressDto addressDto) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }
}
