package uz.kaizen.UniversityManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.kaizen.UniversityManagement.entity.Address;

/**
 * DTO for {@link Address}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressDto {
    String region;
    String district;
    String street;
    String homeNumber;
}