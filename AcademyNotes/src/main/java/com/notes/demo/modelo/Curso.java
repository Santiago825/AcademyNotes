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
@Table(name="curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_CURSO;
    private String NOMBRE_CURSO;

    public Curso() {
    }

    public Curso(int ID_CURSO, String NOMBRE_CURSO) {
        this.ID_CURSO = ID_CURSO;
        this.NOMBRE_CURSO = NOMBRE_CURSO;
    }

    public int getID_CURSO() {
        return ID_CURSO;
    }

    public void setID_CURSO(int ID_CURSO) {
        this.ID_CURSO = ID_CURSO;
    }

    public String getNOMBRE_CURSO() {
        return NOMBRE_CURSO;
    }

    public void setNOMBRE_CURSO(String NOMBRE_CURSO) {
        this.NOMBRE_CURSO = NOMBRE_CURSO;
    }
    
    
    
}
