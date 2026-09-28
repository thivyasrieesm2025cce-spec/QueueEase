package com.example.QueueEase.Patient.Service;

import com.example.QueueEase.Patient.Entity.PatientEntity;
import com.example.QueueEase.Patient.Repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientEntity> getAllPatients() {
        return patientRepository.findAll();
    }

    public PatientEntity getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    public PatientEntity addPatient(PatientEntity patient) {
        return patientRepository.save(patient);
    }

    public PatientEntity updatePatient(Long id, PatientEntity patient) {

        PatientEntity existingPatient =
                patientRepository.findById(id).orElse(null);

        if (existingPatient != null) {
            existingPatient.setName(patient.getName());
            existingPatient.setAge(patient.getAge());
            existingPatient.setGender(patient.getGender());
            existingPatient.setPhone(patient.getPhone());

            return patientRepository.save(existingPatient);
        }

        return null;
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}