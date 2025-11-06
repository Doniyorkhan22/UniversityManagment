package uz.kaizen.UniversityManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.kaizen.UniversityManagement.dto.UniversityDto;
import uz.kaizen.UniversityManagement.entity.Faculty;
import uz.kaizen.UniversityManagement.entity.University;
import uz.kaizen.UniversityManagement.repository.FacultyRepository;
import uz.kaizen.UniversityManagement.service.servicePlane.UniversityService;

import java.util.List;

@RestController
@RequestMapping("/api/university")
public class UniversityController {
    @Autowired
    UniversityService universityService;
    @PostMapping
    public ResponseEntity<?> add(UniversityDto universityDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(universityService.add(universityDto));
    }
    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(universityService.getAll());
    }

}
