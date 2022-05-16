/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jorge
 */
@Entity
@Getter
@Setter
@Table(name = "ingresante")
public class Ingresante {

    /**
     * **************Datos Duros********************************
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mail;
    private Long celu;
    private String tDoc;
    private String numDoc;
    private String apellido;
    private String nombre;
    private String fNacimiento;
    private String genero;
    private String nacionalidad;
    private String pais;
    private String provincia;
    private String localidadResi;
    private String domicilio;
    private Boolean d_estado=false;
    /**
     * **************Tayectoria Educativa********************************
     */
    private String e_nivelMaximo;
    private String e_egresadoDe;
    private String e_establecimiento;
    private Integer e_anioEgreso;
    private Boolean e_estado=false;
    /**
     * **************Situacion Laboral********************************
     */
    private String t_situacionActual;
    private String t_relacion;
    private String t_actividadPrincipal;
    private String t_roles;
    private String t_duracion;
    private Integer t_antiguedad;
    private Integer t_aniosDelSector;
    private String t_estudiosSector;
    private String t_aportesJ;
    private String t_plataPara;
    private String t_horas;
    private String t_franja;
    private Boolean t_estado=false;
    /**
     * **************nivel Ingles********************************
     */
    private String i_estudiaste;
    private String i_donde;
    private String i_nivel_oral;
    private String i_nivel_escrito;
    private String i_nivel_lectura;
    private String i_uso_trabajo;
    private String i_uso_t_situacion;
    private String i_conseguirOportunidades;
    private String i_programacion;
    private String i_cercerProfecionalmente;
    private String i_valorTiempo;
    private Boolean i_estado=false;
    /**
     * **************test********************************
     */
    @OneToOne

    private Examen examen;

    public Ingresante() {
    }

    public Ingresante(Long id, String mail, String numDoc, String apellido, String nombre, String e_egresadoDe, String e_establecimiento) {
        this.id = id;
        this.mail = mail;
        this.numDoc = numDoc;
        this.apellido = apellido;
        this.nombre = nombre;
        this.e_egresadoDe = e_egresadoDe;
        this.e_establecimiento = e_establecimiento;
    }

    public Ingresante(Long id, String mail, Long celu, String tDoc, String numDoc, String apellido, String nombre, String fNacimiento, String genero, String nacionalidad, String pais, String provincia, String localidadResi, String domicilio, String e_nivelMaximo, String e_egresadoDe, String e_establecimiento, Integer e_anioEgreso, String t_situacionActual, String t_relacion, String t_actividadPrincipal, String t_roles, String t_duracion, Integer t_antiguedad, Integer t_aniosDelSector, String t_aportesJ, String t_plataPara, String t_horas, String t_franja, String i_estudiaste, String i_donde, String i_nivel_oral, String i_nivel_escrito, String i_nivel_lectura, String i_uso_trabajo, String i_uso_t_situacion, String i_conseguirOportunidades, String i_programacion, String i_cercerProfecionalmente, String i_valorTiempo, Examen examen) {
        this.id = id;
        this.mail = mail;
        this.celu = celu;
        this.tDoc = tDoc;
        this.numDoc = numDoc;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.pais = pais;
        this.provincia = provincia;
        this.localidadResi = localidadResi;
        this.domicilio = domicilio;
        this.e_nivelMaximo = e_nivelMaximo;
        this.e_egresadoDe = e_egresadoDe;
        this.e_establecimiento = e_establecimiento;
        this.e_anioEgreso = e_anioEgreso;
        this.t_situacionActual = t_situacionActual;
        this.t_relacion = t_relacion;
        this.t_actividadPrincipal = t_actividadPrincipal;
        this.t_roles = t_roles;
        this.t_duracion = t_duracion;
        this.t_antiguedad = t_antiguedad;
        this.t_aniosDelSector = t_aniosDelSector;
        this.t_aportesJ = t_aportesJ;
        this.t_plataPara = t_plataPara;
        this.t_horas = t_horas;
        this.t_franja = t_franja;
        this.i_estudiaste = i_estudiaste;
        this.i_donde = i_donde;
        this.i_nivel_oral = i_nivel_oral;
        this.i_nivel_escrito = i_nivel_escrito;
        this.i_nivel_lectura = i_nivel_lectura;
        this.i_uso_trabajo = i_uso_trabajo;
        this.i_uso_t_situacion = i_uso_t_situacion;
        this.i_conseguirOportunidades = i_conseguirOportunidades;
        this.i_programacion = i_programacion;
        this.i_cercerProfecionalmente = i_cercerProfecionalmente;
        this.i_valorTiempo = i_valorTiempo;
        this.examen = examen;
    }

    

   
    

   

}
