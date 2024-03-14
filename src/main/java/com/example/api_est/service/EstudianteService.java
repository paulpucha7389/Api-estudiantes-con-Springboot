package com.example.api_est.service;

import com.example.api_est.repository.EstudianteRepository;
import com.example.api_est.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;
    public List<Estudiante> getEstudiantes(){
        return estudianteRepository.findAll();
    }

    public Optional<Estudiante> getEstudiante(Long id){
        return estudianteRepository.findById(id);
    }

    public void saveOrUpdate (Estudiante estudiante){
        estudianteRepository.save(estudiante);
    }

    public void delete (Long id){
        estudianteRepository.deleteById(id);
    }
}
