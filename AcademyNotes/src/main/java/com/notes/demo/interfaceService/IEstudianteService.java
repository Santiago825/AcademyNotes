/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.notes.demo.interfaceService;




import com.notes.demo.modelo.Estudiante;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author santi
 */
public interface IEstudianteService {
    public List<Estudiante>listar();
    public Optional<Estudiante>listarId(int id);
    public int save(Estudiante e);
    public void delete(int id);  
    public Estudiante login(String correo, String contrasena); 
    public Estudiante findEstudiante(String numId); 
    
}
