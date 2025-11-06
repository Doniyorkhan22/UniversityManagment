package uz.kaizen.UniversityManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.kaizen.UniversityManagement.entity.Groups;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link Groups}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GroupDto implements Serializable {
    String groupName;
    String groupOwner;
    UUID facultyUuid;
    UUID universityUuid;
}