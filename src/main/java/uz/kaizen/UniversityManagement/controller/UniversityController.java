package uz.kaizen.UniversityManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.kaizen.UniversityManagement.entity.FacultyEntity;
import uz.kaizen.UniversityManagement.repository.FacultyEntityRepository;

import java.util.List;

@RestController
@RequestMapping("/university")
public class UniversityController {

    private final FacultyEntityRepository facultyEntityRepository;

    public UniversityController(FacultyEntityRepository facultyEntityRepository) {
        this.facultyEntityRepository = facultyEntityRepository;
    }

    @GetMapping("/faculty/{facultyName}")
    public List<FacultyEntity> getAllFaculty(@RequestParam String facultyName){
        return facultyEntityRepository.findAllByFacultyName(facultyName);
    }
}
