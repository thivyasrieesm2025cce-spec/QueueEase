package com.example.QueueEase.Doctor.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    private String name;
    private String specialization;
    private int consultationTime;

    public DoctorEntity() {
    }

    public DoctorEntity(String name, String specialization, int consultationTime) {
        this.name = name;
        this.specialization = specialization;
        this.consultationTime = consultationTime;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getConsultationTime() {
        return consultationTime;
    }

    public void setConsultationTime(int consultationTime) {
        this.consultationTime = consultationTime;
    }
}