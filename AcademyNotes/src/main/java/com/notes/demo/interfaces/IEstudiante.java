/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.notes.demo.interfaces;

import com.notes.demo.modelo.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEstudiante extends CrudRepository<Estudiante, Integer>{
    Estudiante findByCorreoAndContrasena(String correo, String contrasena);
    Estudiante findByNumeroidentificacion(String numId);
}
