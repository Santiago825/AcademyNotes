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

/**
 *
 * @author santi
 */
@Entity
@Table(name="boletin")
public class Boletin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idboletin;
    private int idestudiante;
    private int idmateria;
    private double primerperiodo;
    private double segundoperiodo;
    private double tercerperiodo;
    private double cuartoperiodo;
    private String observacion;

    public Boletin() {
    }

    public Boletin(int idboletin, int idestudiante, int idmateria, double primerperiodo, double segundoperiodo, double tercerperiodo, double cuartoperiodo, String observacion) {
        this.idboletin = idboletin;
        this.idestudiante = idestudiante;
        this.idmateria = idmateria;
        this.primerperiodo = primerperiodo;
        this.segundoperiodo = segundoperiodo;
        this.tercerperiodo = tercerperiodo;
        this.cuartoperiodo = cuartoperiodo;
        this.observacion = observacion;
    }

    

    public int getIdboletin() {
        return idboletin;
    }

    public void setIdboletin(int idboletin) {
        this.idboletin = idboletin;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }

    public double getPrimerperiodo() {
        return primerperiodo;
    }

    public void setPrimerperiodo(double primerperiodo) {
        this.primerperiodo = primerperiodo;
    }

    public double getSegundoperiodo() {
        return segundoperiodo;
    }

    public void setSegundoperiodo(double segundoperiodo) {
        this.segundoperiodo = segundoperiodo;
    }

    public double getTercerperiodo() {
        return tercerperiodo;
    }

    public void setTercerperiodo(double tercerperiodo) {
        this.tercerperiodo = tercerperiodo;
    }

    public double getCuartoperiodo() {
        return cuartoperiodo;
    }

    public void setCuartoperiodo(double cuartoperiodo) {
        this.cuartoperiodo = cuartoperiodo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    

    
    
    
    
    
}
