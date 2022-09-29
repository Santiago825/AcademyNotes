/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.notes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="materias")
public class Materias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_MATERIA ;
    private String NOMBRE_MATERIA ;

    public Materias() {
    }

    public Materias(int ID_MATERIA, String NOMBRE_MATERIA) {
        this.ID_MATERIA = ID_MATERIA;
        this.NOMBRE_MATERIA = NOMBRE_MATERIA;
    }

    public int getID_MATERIA() {
        return ID_MATERIA;
    }

    public void setID_MATERIA(int ID_MATERIA) {
        this.ID_MATERIA = ID_MATERIA;
    }

    public String getNOMBRE_MATERIA() {
        return NOMBRE_MATERIA;
    }

    public void setNOMBRE_MATERIA(String NOMBRE_MATERIA) {
        this.NOMBRE_MATERIA = NOMBRE_MATERIA;
    }
    
    
    
}
