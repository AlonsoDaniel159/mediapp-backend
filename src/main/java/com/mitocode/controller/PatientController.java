package com.mitocode.controller;

import com.mitocode.model.Patient;
import com.mitocode.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private PatientService service = new PatientService();

    @GetMapping
    public String sayHello() {
        Patient patient = new Patient(1,"Mitocode");
        return service.sayHello(patient);
    }

}
