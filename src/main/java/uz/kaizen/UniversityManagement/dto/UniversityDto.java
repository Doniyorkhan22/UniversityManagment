package uz.kaizen.UniversityManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.kaizen.UniversityManagement.entity.University;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link University}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UniversityDto implements Serializable {
    String universityName;
    String universityShortName;
    String universityCEO;
    UUID addressUuid;
}