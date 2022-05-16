/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.controller;

import BaseInglesFinal.demo.entity.Examen;
import BaseInglesFinal.demo.entity.Ingresante;
import BaseInglesFinal.demo.service.ExamenService;
import BaseInglesFinal.demo.service.IngresanteService;
import BaseInglesFinal.demo.util.Utiles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author jorge
 */
@Controller

@RequestMapping("/ingresante")
public class IngresanteController {

    @Autowired
    private IngresanteService is;
    @Autowired
    private Utiles ut;
    @Autowired
    private ExamenService es;

    @GetMapping("/consulta")
    public String subir() {

        return "buscaringresante";
    }

    @PostMapping("/traer")
    public String traerIngresante(@RequestParam String doc, Model model) {
        Ingresante busqueda = is.findIngresanteByDoc(doc);
        if (busqueda == null) {
            model.addAttribute("no", "el documento no figura en nuestra base de datos");
            return "buscaringresante";
        } else if (busqueda.getD_estado() == false) {
            Ingresante ingre = is.findIngresanteByDoc(doc);
            model.addAttribute("listaBarriosCaba", ut.devolverBarriosCaba());
            model.addAttribute("listaDeLocalidadesGcba", ut.devolverLocalidades());
            model.addAttribute("listaProvincias", ut.devolverProvincias());
            model.addAttribute("listaPaises", ut.devolverPaises());
            model.addAttribute("ingresante", ingre);
            return "datosduros";
        } else if (busqueda.getD_estado() == true && busqueda.getE_estado() == false && busqueda.getT_estado() == false) {
            model.addAttribute("ingresante", busqueda);
            model.addAttribute("listaNivelAlcanzado", ut.devolverNivelEstudios());
            model.addAttribute("listaEgresadoDe", ut.devolverSosEgregadoDe());
            model.addAttribute("listaActividades", ut.devolverActividadesPrincipales());
            model.addAttribute("listaRolIt", ut.devolverRolesIt());

            return "encuentapersonal";
        } else if (busqueda.getD_estado() == true && busqueda.getE_estado() == true && busqueda.getT_estado() == true && busqueda.getI_estado() == false) {
            model.addAttribute("ingresante", busqueda);

            return "nivelingles";
        } else if (busqueda.getD_estado() == true && busqueda.getE_estado() == true
                && busqueda.getT_estado() == true && busqueda.getI_estado() == true && busqueda.getExamen() == null) {
            model.addAttribute("ingresante", busqueda);
            return "examen-aviso";
        }
        return "Usted ya finalizo todoas las inancias";
    }

    @PostMapping("/duros")
    public String saveDuros(Ingresante ingresante, Model model) {
        Ingresante modificado = is.guardarDDuros(ingresante);
        is.saveIngresante(modificado);
        model.addAttribute("ingresante", modificado);
        model.addAttribute("listaNivelAlcanzado", ut.devolverNivelEstudios());
        model.addAttribute("listaEgresadoDe", ut.devolverSosEgregadoDe());
        model.addAttribute("listaActividades", ut.devolverActividadesPrincipales());
        model.addAttribute("listaRolIt", ut.devolverRolesIt());

        return "encuentapersonal";
    }

    @PostMapping("/encuenta")
    public String saveEncuenta(Ingresante ingresante, Model model) {
        Ingresante modificado = is.guardarEncuenta(ingresante);
        is.saveIngresante(modificado);

        model.addAttribute("ingresante", modificado);

        return "nivelingles";
    }

    @PostMapping("/nivel")
    public String saveNivel(Ingresante ingresante, Model model, String i_uso_t_situacion_otro, String i_donde_otro) {

        Ingresante modificado = is.guardarNivel(ingresante, i_uso_t_situacion_otro, i_donde_otro);

        modificado = is.saveIngresante(modificado);

        model.addAttribute("ingresante", modificado);

        return "examen-aviso";
    }

    @PostMapping("/realizar-examen")
    public String saveNivel(Ingresante ingresante, Model model) {
        Ingresante ingre = is.findIngresanteById(ingresante.getId());
        Examen exa = new Examen();
        exa.setApellido(ingre.getApellido());
        exa.setNombre(ingre.getNombre());
        exa.setNumDoc(ingre.getNumDoc());
        exa.setId_ingresante(ingre.getId());
        ingre.setExamen(es.save(exa));
        ingre=is.saveIngresante(ingre) ;
        model.addAttribute("examen", ingre.getExamen() );

        return "new_examen";
    }

}
