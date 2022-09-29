/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.notes.demo.interfaceService;

import com.notes.demo.modelo.Boletin;
import java.util.Optional;

/**
 *
 * @author santi
 */
public interface IBoletinService {
    public Boletin findBoleltin(int idestudiante, int idmateria);
    public Boletin listarId(int id);
    public int save(Boletin e);
    
}
