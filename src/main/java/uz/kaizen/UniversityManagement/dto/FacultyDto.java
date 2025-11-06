package uz.kaizen.UniversityManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.kaizen.UniversityManagement.entity.Faculty;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link Faculty}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FacultyDto implements Serializable {
    String facultyName;
    String facultyCEO;
    UUID universityUuid;
}