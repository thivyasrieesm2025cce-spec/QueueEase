package com.example.QueueEase.Doctor.Service;

import com.example.QueueEase.Doctor.Entity.DoctorEntity;
import com.example.QueueEase.Doctor.Repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<DoctorEntity> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public DoctorEntity getDoctorById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }

    public DoctorEntity addDoctor(DoctorEntity doctor) {
        return doctorRepository.save(doctor);
    }

    public DoctorEntity updateDoctor(Long id, DoctorEntity doctor) {
        DoctorEntity existingDoctor = doctorRepository.findById(id).orElse(null);

        if (existingDoctor != null) {
            existingDoctor.setName(doctor.getName());
            existingDoctor.setSpecialization(doctor.getSpecialization());
            existingDoctor.setConsultationTime(doctor.getConsultationTime());

            return doctorRepository.save(existingDoctor);
        }

        return null;
    }

    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
}