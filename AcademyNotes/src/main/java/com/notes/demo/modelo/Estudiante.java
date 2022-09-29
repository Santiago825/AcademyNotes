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
@Table(name="estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_estudiante ;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private String numeroidentificacion;
    private int curso;
    private int tipousuario;


    public Estudiante() {
    }

    public Estudiante(int id_estudiante, String nombre, String apellido, String correo, String contrasena, String numeroidentificacion, int curso, int tipousuario) {
        this.id_estudiante = id_estudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.numeroidentificacion = numeroidentificacion;
        this.curso = curso;
        this.tipousuario = tipousuario;

    }

    
    


    

    

  

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNumeroidentificacion() {
        return numeroidentificacion;
    }

    public void setNumeroidentificacion(String numeroidentificacion) {
        this.numeroidentificacion = numeroidentificacion;
    }

    

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(int tipousuario) {
        this.tipousuario = tipousuario;
    }


    

    


    

    
    
    
}
