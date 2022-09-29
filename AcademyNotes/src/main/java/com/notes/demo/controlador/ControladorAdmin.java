/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.notes.demo.controlador;

import com.notes.demo.modelo.Boletin;
import com.notes.demo.modelo.Estudiante;
import com.notes.demo.modelo.Materias;
import com.notes.demo.service.BoletinService;
import com.notes.demo.service.CursoService;
import com.notes.demo.service.EstudianteService;
import com.notes.demo.service.MateriaService;
import java.util.List;
import java.util.Objects;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class ControladorAdmin {

    @Autowired
    private EstudianteService userService;
    @Autowired
    private MateriaService materiaService;
    @Autowired
    private BoletinService boletinService;
    @Autowired
    private CursoService cursoService;

    @GetMapping("/busqueda")
    public ModelAndView busquedaEstu(HttpSession session, Model model) {
        ModelAndView mav;
        if (session.getAttribute("idUser") != null) {
            model.addAttribute("nombre", session.getAttribute("name"));
            mav = new ModelAndView("paginaPrincipalAdmin");
        } else {
            mav = new ModelAndView("login");
        }
        mav.addObject("user", new Estudiante());
        return mav;
    }

    @PostMapping("/busqueda")
    public String busquedaEstu(HttpSession session, @ModelAttribute("user") Estudiante user, Model model) {
        if (session.getAttribute("idUser") != null) {
            Estudiante oauthUser = userService.findEstudiante(user.getNumeroidentificacion());
         
            if (Objects.nonNull(oauthUser)) {
                session.setAttribute("nombreEstudinet", oauthUser.getNombre());
                session.setAttribute("cursoEstudinet", oauthUser.getCurso());
                return "redirect:/materiasAdmin/" + oauthUser.getId_estudiante();
            } else {
                return "redirect:/busqueda";
            }
        } else {
            return "redirect:/login";
        }

    }

    @GetMapping("/materiasAdmin/{id}")
    public String materiasAdmin(HttpSession session, @PathVariable int id, Model model) {
        if (session.getAttribute("idUser") != null) {
            List<Materias> materia = materiaService.listar();
            String curso = cursoService.buscarId((int) session.getAttribute("curso")).getNOMBRE_CURSO();
            System.out.println(curso);

            model.addAttribute("materias", materia);
            model.addAttribute("idUsuario", id);
            model.addAttribute("nombre", session.getAttribute("name"));
            model.addAttribute("nombreEstudiante", session.getAttribute("nombreEstudinet"));
            model.addAttribute("curso", curso);
            return "materiasEstudinatesAdmin";
        } else {
            return "redirect:/login";
        }
    }

    @GetMapping("/notasEdit/{idusuario}/{id}")
    public String notasEdit(HttpSession session, @PathVariable int idusuario, @PathVariable int id, Model model) {

        if (session.getAttribute("idUser") != null) {
            Boletin boletines = boletinService.findBoleltin(idusuario, id);
            String materia = materiaService.buscarId(id).getNOMBRE_MATERIA();
            model.addAttribute("idUsuario", idusuario);
            model.addAttribute("materia", materia);
            model.addAttribute("nombre", session.getAttribute("nombreEstudinet"));
            model.addAttribute("boletin", boletines);
            return "notasEditablesAdmin";
        } else {
            return "redirect:/login";
        }
    }

    @PostMapping("/guardar/{id}")
    public String agregarNotas(HttpSession session, @PathVariable int id, @ModelAttribute("boletin") Boletin boletin, Model model) {
        if (session.getAttribute("idUser") != null) {
            Boletin boletines = boletinService.listarId(id);
            boletines.setPrimerperiodo(boletin.getPrimerperiodo());
            boletines.setSegundoperiodo(boletin.getSegundoperiodo());
            boletines.setTercerperiodo(boletin.getTercerperiodo());
            boletines.setCuartoperiodo(boletin.getCuartoperiodo());

            boletinService.save(boletines);
            return "redirect:/materiasAdmin/" + boletines.getIdestudiante();
        } else {
            return "redirect:/login";
        }
    }

}
