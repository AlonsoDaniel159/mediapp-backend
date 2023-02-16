package com.mitocode.repo;

import com.mitocode.model.Patient;
import org.springframework.stereotype.Repository;

@Repository
public class PatientRepo {

    public String sayHello(Patient patient) {
        return "Hello "+ patient.getName();
    }
}
