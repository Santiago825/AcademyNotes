/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.notes.demo.service;

import com.notes.demo.interfaceService.IMateriaService;
import com.notes.demo.interfaces.IMateria;
import com.notes.demo.modelo.Materias;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author santi
 */
@Service
public class MateriaService implements IMateriaService{
    @Autowired
    private IMateria data;

    @Override
    public List<Materias> listar() {
        return (List<Materias>) data.findAll();
    }

    @Override
    public Optional<Materias> listarId(int id) {
         return data.findById(id);
    }

    @Override
    public int save(Materias e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Materias buscarId(int id) {
        return data.findById(id).get();
    }
    
}
