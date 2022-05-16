/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.service;

import BaseInglesFinal.demo.entity.Examen;
import BaseInglesFinal.demo.repository.ExamenRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jorge
 */
@Service
public class ExamenServiceIMPL implements ExamenService{
@Autowired
private ExamenRepository er;
private int contador;   
@Override
    public Examen createExamen(Examen examen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Transactional(readOnly = true)
    @Override
    public List<Examen> findAllExamen() {
      return (List<Examen>)er.findAll();
    }
    @Transactional
    @Override
    public Examen save(Examen examen) {

     return er.save(examen);
    }
    @Transactional
    @Override
    public void delete(Examen examen) {
    er.delete(examen);
    
    }
    @Transactional(readOnly = true)
    @Override
    public Examen findExamen(Examen examen) {
     return er.findById(examen.getId()).orElse(null);
    }
    @Transactional(readOnly = true)
    @Override
    public Examen findExamenById(Long id) {
return er.findById(id).orElse(null);
    }

    @Override
    public Examen evaluar(Examen examen) {
        
        contador=0;
        if (examen.getP1() != null) {
            if (examen.getP1().equalsIgnoreCase("c")) {
                contador=contador + 1;
            }
        }
        if (examen.getP2() != null) {
            if (examen.getP2().equalsIgnoreCase("b")) {
                contador=contador + 1;
            }
        }
        if (examen.getP3() != null) {
            if (examen.getP3().equalsIgnoreCase("c")) {
                contador=contador + 1;
            }
        }
        if (examen.getP4() != null) {
            if (examen.getP4().equalsIgnoreCase("a")) {
                contador=contador + 1;
            }
        }
        if (examen.getP5() != null) {
            if (examen.getP5().equalsIgnoreCase("d")) {
                contador=contador + 1;
            }
        }
        if (examen.getP6() != null) {
            if (examen.getP6().equalsIgnoreCase("b")) {
                contador=contador + 1;
            }
        }
        if (examen.getP7() != null) {
            if (examen.getP7().equalsIgnoreCase("a")) {
                contador=contador + 1;
            }
        }
        if (examen.getP8() != null) {
            if (examen.getP8().equalsIgnoreCase("c")) {
                contador=contador + 1;
            }
        }
        if (examen.getP9() != null) {
            if (examen.getP9().equalsIgnoreCase("d")) {
                contador=contador + 1;
            }
        }
        if (examen.getP10() != null) {
            if (examen.getP10().equalsIgnoreCase("d")) {
                contador=contador + 1;
            }
        }
        if (examen.getP11() != null) {
            if (examen.getP11().equalsIgnoreCase("c")) {
                contador=contador + 1;
            }
        }
        if (examen.getP12() != null) {
            if (examen.getP12().equalsIgnoreCase("b")) {
                contador=contador + 1;
            }
        }
        if (examen.getP13() != null) {
            if (examen.getP13().equalsIgnoreCase("d")) {
                contador=contador + 1;
            }
        }
        if (examen.getP14() != null) {
            if (examen.getP14().equalsIgnoreCase("c")) {
                contador=contador + 1;
            }
        }
        if (examen.getP15() != null) {
            if (examen.getP15().equalsIgnoreCase("a")) {
                contador=contador + 1;
            }
        }
        if (examen.getP16() != null) {
            if (examen.getP16().equalsIgnoreCase("c")) {
                contador=contador + 1;
            }
        }
        if (examen.getP17() != null) {
            if (examen.getP17().equalsIgnoreCase("a")) {
                contador=contador + 1;
            }
        }
        if (examen.getP18() != null) {
            if (examen.getP18().equalsIgnoreCase("d")) {
                contador=contador + 1;
            }
        }
        if (examen.getP19() != null) {
            if (examen.getP19().equalsIgnoreCase("b")) {
                contador=contador + 1;
            }
        }
        if (examen.getP20() != null) {
            if (examen.getP20().equalsIgnoreCase("a")) {
                contador=contador + 1;
            }
        }
        examen.setR_Correctas(contador);
        examen.setEstado(true);
        examen.setFechaDeFinalizacion(new Date());
        return examen;
    }
    
}
