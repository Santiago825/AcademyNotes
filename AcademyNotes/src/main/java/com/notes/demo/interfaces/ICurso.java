/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.notes.demo.interfaces;

import com.notes.demo.modelo.Curso;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author santi
 */
public interface ICurso extends CrudRepository<Curso, Integer>{
    
}
