/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.notes.demo.service;

import com.notes.demo.interfaceService.ICursoService;
import com.notes.demo.interfaces.ICurso;
import com.notes.demo.modelo.Curso;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author santi
 */
@Service
public class CursoService implements ICursoService {

    @Autowired
    private ICurso data;

    @Override
    public Curso buscarId(int id) {
        return data.findById(id).get();

    }

}
