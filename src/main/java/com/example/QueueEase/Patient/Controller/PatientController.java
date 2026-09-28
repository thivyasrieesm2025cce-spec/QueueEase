package com.example.QueueEase.Patient.Controller;

import com.example.QueueEase.Patient.Entity.PatientEntity;
import com.example.QueueEase.Patient.Service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public List<PatientEntity> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public PatientEntity getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }

    @PostMapping
    public PatientEntity addPatient(@RequestBody PatientEntity patient) {
        return patientService.addPatient(patient);
    }

    @PutMapping("/{id}")
    public PatientEntity updatePatient(
            @PathVariable Long id,
            @RequestBody PatientEntity patient) {

        return patientService.updatePatient(id, patient);
    }

    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
        return "Patient deleted successfully";
    }
}