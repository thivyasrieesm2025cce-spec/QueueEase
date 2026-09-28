package com.example.QueueEase.Patient.Repository;

import com.example.QueueEase.Patient.Entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientEntity, Long> {
}