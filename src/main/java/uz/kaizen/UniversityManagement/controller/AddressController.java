package uz.kaizen.UniversityManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.kaizen.UniversityManagement.dto.AddressDto;
import uz.kaizen.UniversityManagement.entity.Address;
import uz.kaizen.UniversityManagement.service.servicePlane.AddressService;

@Controller
@RequestMapping("/api/address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping
    public ResponseEntity<?> add(AddressDto addressDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(addressService.add(addressDto));
    }
    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(addressService.getAll());
    }
}
