/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.notes.demo.interfaces;

import com.notes.demo.modelo.Boletin;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author santi
 */
public interface IBoletin extends CrudRepository<Boletin, Integer> {
    Boletin findByIdestudianteAndIdmateria (int idestudiante, int idmateria);

    
}
