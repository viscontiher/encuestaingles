/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.controller;

import BaseInglesFinal.demo.entity.Examen;
import BaseInglesFinal.demo.entity.Ingresante;
import BaseInglesFinal.demo.service.ExamenService;
import BaseInglesFinal.demo.service.IngresanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author jorge
 */
@Controller

@RequestMapping("/examen")
public class ExamenController {
    @Autowired
    private ExamenService es;
 @Autowired
    private IngresanteService is;

   

    

    @PostMapping("/save")
    public String save(Examen examen) {
       Examen examenNew=new Examen();
       examenNew =es.evaluar(examen);
       examenNew=es.save(examenNew);
        Ingresante busqueda=is.findIngresanteById(examenNew.getId_ingresante());
       busqueda.setExamen(examen);
       is.saveIngresante(busqueda);
        return "Finalizo con exito espere noticias";
    }
    
   @GetMapping("/delete")
    public String delete(@RequestParam Long id,Model model) {
        Examen examen=es.findExamenById(id);
        es.delete(examen);
        model.addAttribute(examen);
        return "delete";

    }
}

