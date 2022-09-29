/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.notes.demo.interfaceService;


import com.notes.demo.modelo.Materias;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author santi
 */
public interface IMateriaService {
    public List<Materias>listar();
    public Optional<Materias>listarId(int id);
    public int save(Materias e);
    public void delete(int id);
    public Materias buscarId(int id);
    
}
