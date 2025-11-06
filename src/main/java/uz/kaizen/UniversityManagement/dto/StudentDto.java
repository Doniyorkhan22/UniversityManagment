package uz.kaizen.UniversityManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.kaizen.UniversityManagement.entity.Student;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link Student}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDto implements Serializable {
    String firstName;
    String lastName;
    boolean gender;
    String email;
    String password;
    UUID groupsUuid;
}