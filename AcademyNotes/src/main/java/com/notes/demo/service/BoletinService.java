/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.notes.demo.service;

import com.notes.demo.interfaceService.IBoletinService;
import com.notes.demo.interfaces.IBoletin;
import com.notes.demo.modelo.Boletin;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author santi
 */
@Service
public class BoletinService implements IBoletinService{
    @Autowired
    private IBoletin data;

    @Override
    public Boletin findBoleltin(int idestudiante, int idmateria) {
        Boletin user = data.findByIdestudianteAndIdmateria(idestudiante, idmateria);
       
        return user;
    }

    @Override
    public int save(Boletin e) {
        int res=0;
        Boletin bo=data.save(e);
        if(!bo.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public Boletin listarId(int id) {
        return data.findById(id).get();
    }


    
}
