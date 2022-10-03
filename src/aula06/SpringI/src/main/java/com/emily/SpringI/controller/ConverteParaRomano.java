package com.emily.SpringI.controller;

import com.emily.SpringI.util.Converter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("romano")

public class ConverteParaRomano {

    @GetMapping("/{decimal}")
    public String conversor(@PathVariable int decimal) {
        return "O número: " + decimal + " em número romano é " + Converter.converterEmRomanos(decimal);
    }
}
