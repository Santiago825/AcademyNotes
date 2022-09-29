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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping

public class Controlador {

    @Autowired
    private EstudianteService userService;
    @Autowired
    private MateriaService materiaService;
    @Autowired
    private BoletinService boletinService;
    @Autowired
    private CursoService cursoService;
 


    @GetMapping("/login")

    public ModelAndView login() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Estudiante());
        return mav;
    }

    @PostMapping("/login")
    public String login(HttpSession session, @ModelAttribute("user") Estudiante user, Model model) {
        
        Estudiante oauthUser = userService.login(user.getCorreo(), user.getContrasena());

        if (Objects.nonNull(oauthUser)) {
            
            session.setAttribute("name",oauthUser.getNombre());
            session.setAttribute("idUser",oauthUser.getId_estudiante());
            session.setAttribute("curso",oauthUser.getCurso());
            
            if (oauthUser.getTipousuario() == 1) {
                
                return "redirect:/busqueda";
            }

            return "redirect:/materias/" + oauthUser.getId_estudiante();

        } else {
            return "redirect:/login";

        }

    }

    @GetMapping("/new")
    public String regitrar(Model model) {
        model.addAttribute("estudinates", new Estudiante());
        return "Registro";

    }

    @PostMapping("/save")
    public String agregarEstudinate(@Valid Estudiante es, Model model) {
        userService.save(es);
        return "redirect:/login";
    }

    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().removeAttribute("idUser");
        request.getSession().removeAttribute("name");
        request.getSession().removeAttribute("curso");
        request.getSession().invalidate();
        return "redirect:/login";
    }

    @GetMapping("/materias/{id}")
    public String materias(HttpSession session,@PathVariable int id, Model model) {
        if(session.getAttribute("idUser")!=null){
            
            List<Materias> materia = materiaService.listar();
            String curso = cursoService.buscarId((int) session.getAttribute("curso")).getNOMBRE_CURSO();
            model.addAttribute("materias", materia);
            model.addAttribute("idUsuario", id);
            model.addAttribute("nombre",session.getAttribute("name"));
            model.addAttribute("curso",curso);

            return "pagina_principal_estudinates";
        }else{
            return "redirect:/login";
            
        }
    }

    @GetMapping("/notas/{idusuario}/{id}")
    public String notas(HttpSession session,@PathVariable int idusuario, @PathVariable int id, Model model) {
        if(session.getAttribute("idUser")!=null ){
            Boletin boletines = boletinService.findBoleltin(idusuario, id);
            String materia = materiaService.buscarId(id).getNOMBRE_MATERIA();
            model.addAttribute("boletin", boletines);
            model.addAttribute("idUsuario", idusuario);
            model.addAttribute("nombre",session.getAttribute("name"));
            model.addAttribute("curso",session.getAttribute("curso"));
            model.addAttribute("materia",materia);
    
        return "notasEstudiante";
        }else{
            return "redirect:/login";
        }
    }
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


}
