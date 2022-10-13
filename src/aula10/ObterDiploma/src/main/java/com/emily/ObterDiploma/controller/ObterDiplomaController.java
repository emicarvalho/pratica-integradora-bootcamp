package com.emily.ObterDiploma.controller;

import com.emily.ObterDiploma.model.StudentDTO;
import com.emily.ObterDiploma.service.IObterDiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ObterDiplomaController {
    @Autowired
    IObterDiplomaService service;

    @PostMapping("/analizeScores")
    public StudentDTO analizeScores(@Valid @RequestBody StudentDTO rq) {
        return service.analyzeScores(rq);
    }
}
