/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.notes.demo.service;

import com.notes.demo.interfaceService.IEstudianteService;
import com.notes.demo.interfaces.IEstudiante;
import com.notes.demo.modelo.Estudiante;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author santi
 */
@Service
public class EstudianteService implements IEstudianteService {

    @Autowired
    private IEstudiante data;

    @Override
    public List<Estudiante> listar() {
        return (List<Estudiante>) data.findAll();
    }

    @Override
    public Optional<Estudiante> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Estudiante es) {
        int res = 0;
        Estudiante estudiante = data.save(es);
        if (!estudiante.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Estudiante login(String correo, String contrasena) {
        Estudiante user = data.findByCorreoAndContrasena(correo, contrasena);
       
        return user;
    }

    @Override
    public Estudiante findEstudiante(String numId) {
        Estudiante user = data.findByNumeroidentificacion(numId);
        return user;
        
    }

}
