package com.example.QueueEase.Doctor.Controller;

import com.example.QueueEase.Doctor.Entity.DoctorEntity;
import com.example.QueueEase.Doctor.Service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public List<DoctorEntity> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public DoctorEntity getDoctorById(@PathVariable Long id) {
        return doctorService.getDoctorById(id);
    }

    @PostMapping
    public DoctorEntity addDoctor(@RequestBody DoctorEntity doctor) {
        return doctorService.addDoctor(doctor);
    }

    @PutMapping("/{id}")
    public DoctorEntity updateDoctor(
            @PathVariable Long id,
            @RequestBody DoctorEntity doctor) {

        return doctorService.updateDoctor(id, doctor);
    }

    @DeleteMapping("/{id}")
    public String deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
        return "Doctor deleted successfully";
    }
}