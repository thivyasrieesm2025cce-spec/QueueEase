package com.example.QueueEase.Doctor.Repository;

import com.example.QueueEase.Doctor.Entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {
}