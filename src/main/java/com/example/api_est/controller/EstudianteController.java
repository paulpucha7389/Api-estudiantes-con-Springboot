package com.example.api_est.controller;

import com.example.api_est.service.EstudianteService;
import com.example.api_est.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping(value= "api/v1/estudiantes")

public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> getAll(){

        return estudianteService.getEstudiantes();

    }

    @GetMapping("/{estudianteId}")
    public Optional<Estudiante> getById(@PathVariable("estudianteId") Long estudianteId){

        return estudianteService.getEstudiante(estudianteId);

    }


    @PostMapping
    public Estudiante saveUpdate(@RequestBody Estudiante estudiante){

        estudianteService.saveOrUpdate(estudiante);

        return estudiante;

    }

    @DeleteMapping("/{estudianteId}")
    public void delete(@PathVariable("estudianteId") Long estudianteId){

        estudianteService.delete(estudianteId);

    }
}
