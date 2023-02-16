package com.mitocode.service;

import com.mitocode.model.Patient;
import com.mitocode.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepo repo;

    public String sayHello(Patient patient) {
        return repo.sayHello(patient);
    }
}
