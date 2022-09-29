/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.notes.demo.interfaces;

import com.notes.demo.modelo.Materias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author santi
 */
@Repository
public interface IMateria extends CrudRepository<Materias, Integer>{
    
}
