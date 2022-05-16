/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.util;

import BaseInglesFinal.demo.entity.Ingresante;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author jorge
 */
@Component
public class Utiles {

    public String comprobardorDecomas(String cadena) {

        String nueva = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ',') {
                nueva = nueva + cadena.charAt(i);
            } else {
                nueva = nueva + "";
            }
        }
        return nueva;
    }

    public List<String> devolverProvincias() {
        List<String> listaProvincias = Arrays.asList("Buenos Aires", "Catamarca", "Chaco", "Chubut", "Ciudad Autonoma de Buenos Aires", "Cordoba", "Corrientes", "Entre Rios", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquen", "Rio Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucuman");
        return listaProvincias;
    }

    public List<String> devolverLocalidades() {

        List<String> listaDeLocalidadesGcba = Arrays.asList("Adolfo Alsina", "Adolfo Gonzales Chaves", "Alberti", "Almirante Brown", "Arrecifes", "Avellaneda", "Ayacucho", "Azul", "Bahía Blanca", "Balcarce", "Baradero", "Benito Juárez", "Berazategui", "Berisso", "Bolívar", "Bragado", "Brandsen", "Campana", "Cañuelas", "Capitán Sarmiento Carlos", "Carlos Casares", "Carlos Tejedor", "Carmen de Areco", "Castelli", "Chacabuco", "Chascomús", "Chivilcoy", "Colón", "Coronel de Marina Leonardo Rosales", "Coronel Dorrego", "Coronel Pringles", "Coronel Suárez", "Daireaux", "Dolores", "Ensenada", "Escobar", "Esteban Echeverría", "Exaltación de la Cruz", "Ezeiza", "Florencio Varela", "Florentino Ameghino", "General Alvarado", "General Alvear", "General Arenales", "General Belgrano", "General Guido", "General Juan Madariaga", "General La Madrid", "General Las Heras", "General Lavalle", "General Paz", "General Pinto", "General Pueyrredón", "General Rodríguez", "General San Martín", "General Viamonte", "General Villegas", "Guaminí", "Hipólito Yrigoyen", "Hurlingham", "Ituzaingó", "José C. Paz", "Junín", "La Costa", "La Matanza", "Lanús", "La Plata", "Laprida", "Las Flores", "Leandro N. Alem", "Lincoln", "Lobería", "Lobos", "Lomas de Zamora", "Luján", "Magdalena", "Maipú", "Malvinas Argentinas", "Mar Chiquita", "Marcos Paz", "Mercedes", "Merlo", "Monte", "Monte Hermoso", "Moreno", "Morón", "Navarro", "Necochea", "Nueve de Julio (9 de Julio)", "Olavarría", "Patagones", "Pehuajó", "Pellegrini", "Pergamino", "Pila", "Pilar", "Pinamar", "Presidente Perón", "Puan", "Punta Indio", "Quilmes", "Ramallo", "Rauch", "Rivadavia", "Rojas", "Roque Pérez", "Saavedra", "Saladillo", "Salliqueló", "Salto", "San Andrés de Giles", "San Antonio de Areco", "San Cayetano", "San Fernando", "San Isidro", "San Miguel", "San Nicolás", "San Pedro", "San Vicente", "Suipacha", "Tandil", "Tapalqué", "Tigre", "Tordillo", "Tornquist", "Trenque Lauquen", "Tres Arroyos", "Tres de Febrero", "Tres Lomas", "Veinticinco de Mayo (25 de Mayo)", "Vicente López", "Villa Gesell", "Villarino", "Zárate");
        return listaDeLocalidadesGcba;
    }

    public List<String> devolverBarriosCaba() {
        List<String> listaBarriosCaba = Arrays.asList("Agronomía (incl. Parque Chas)", "Almagro", "Balvanera", "Barracas", "Belgrano", "Boedo", "Caballito", "Chacarita", "Coghlan", "Colegiales", "Constitución", "Flores", "Floresta", "La Boca", "La Paternal", "Liniers", "Mataderos", "Monserrat", "Monte Castro", "Nueva Pompeya", "Núñez", "Palermo", "Parque Avellaneda", "Parque Chacabuco", "Parque Patricios", "Puerto Madero (incl. Área Reserva Ecológica)", "Recoleta", "Retiro", "Saavedra", "San Cristóbal", "San Nicolás", "San Telmo", "Vélez Sársfield", "Versalles", "Villa Crespo", "Villa del Parque", "Villa Devoto", "Villa General Mitre", "Villa Lugano", "Villa Luro", "Villa Ortúzar", "Villa Pueyrredón", "Villa Real", "Villa Riachuelo", "Villa Santa Rita", "Villa Soldati", "Villa Urquiza");
        return listaBarriosCaba;
    }

    public List<String> devolverPaises() {
        List<String> listaPaises = Arrays.asList("Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Costa Rica", "Cuba", "Ecuador", "El Salvador", "Guayana Francesa", "Granada", "Guatemala", "Guayana", "Haití", "Honduras", "Jamaica", "México", "Nicaragua", "Paraguay", "Panamá", "Perú", "Puerto Rico", "República Dominicana", "Surinam", "Uruguay", "Venezuela", "Otro");
        return listaPaises;
    }

    public List<String> devolverNivelEstudios() {
        List<String> estudios = Arrays.asList("Secundario completo", "Terciario completo", "Terciario en curso", "Terciario incompleto", "Universitario incompleto", "Universitario en curso", "Universitario completo", "Posgrado incompleto", "Posgrado en curso", "Posgrado completo");
        return estudios;

    }

    public List<String> devolverSosEgregadoDe() {
        List<String> egresadoDe = Arrays.asList("CAC 4.0 Full Stack – Java",
                "CAC 4.0  Full Stack – PHP",
                "CAC 4.0  Full Stack – Python",
                "CAC 4.0  FullStack – Desarrollo Web (JavaScript/Node JS)",
                "CAC 4.0  FullStack – React/Mongo/GoLang/GO",
                "CAC 4.0 Testing/QA",
                "CAC 4.0 Big Data",
                "CAC 4.0 UX/UI",
                "Especialización en programación Web",
                "Especialización Profesional en Programación de Videojuegos",
                "Programador",
                "Programador de base de datos",
                "Tecnicatura Superior en Análisis de Sistemas",
                "Tecnicatura Superior en Automatización y Robótica",
                "Tecnicatura Superior en Telecomunicaciones",
                "Tecnicatura Superior en Teleinformática"
        );
        return egresadoDe;

    }

    public List<String> devolverActividadesPrincipales() {
        List<String> actividadesPrincipales = Arrays.asList("ELECTRÓNICA", "ESTÉTICA PROFESIONAL", "HOTELERÍA Y GASTRONOMÍA", "TEXTIL E INDUMENTARIA", "ADMINISTRACIÓN", "GESTIÓN Y SERVICIOS EMPRESARIALES", "SEGURIDAD", "AMBIENTE E HIGIENE", "ELECTROMECÁNICA", "MECÁNICA", "METALMECÁNICA Y METALURGIA", "INFORMÁTICA", "CUERO Y CALZADO", "AGROPECUARIO", "MADERA Y MUEBLE", "INDUSTRIAS DE PROCESOS", "TURISMO", "ACTIVIDADES ARTISTICAS TECNICAS", "CONSTRUCCIONES", "SALUD", "AUTOMOTRIZ", "ENERGÍA", "INDUSTRIAS GRAFICA", "PUBLICITARIA Y MULTIMEDIAL", "INDUSTRIA ALIMENTARIA", "MINERÍA E HIDROCARBUROS", "NAVAL", "FERROVIARIO", "AERONÁUTICA", "COMERCIO", "ACTIVIDAD FINANCIERA", "ADMINISTRACIÓN PÚBLICA", "ENSEÑANZA", "DESARROLLO HUMANO"
        );
        return actividadesPrincipales;

    }

    public List<String> devolverRolesIt() {
        List<String> listaRolesIt = Arrays.asList(
                "ADMINISTRADOR DE BASE DE DATOS (DBA)", "ADMINISTRADOR DE REDES", "ANALISTA BIG DATA (DATA SCIENTIST)", "ANALISTA UX", "ANALISTA FUNCIONAL", "ARQUITECTO DE SOFTWARE", "DESARROLLADOR DE SOFTWARE", "DISEÑADOR WEB", "LÍDER DE DESARROLLO", "PROJECT MANAGER (PM)", "SOPORTE TÉCNICO", "TESTER", "NO OCUPO UN ROL IT"
        );
        return listaRolesIt;

    }

    public List<Ingresante> evitarDocDuplicadosPaso1(List<Ingresante> lista) {
        List<Ingresante> listaVerificada = new ArrayList<>();
        int contador = 0;
        var verificado = true;
        Ingresante ingre = new Ingresante();

        for (Ingresante ingreOri : lista) {
            contador++;
            verificado = true;
            if (contador == 0) {
                listaVerificada.add(ingreOri);
            } else {
                ingre = ingreOri;
                for (Ingresante ingresante : listaVerificada) {
                    if (ingresante.getNumDoc().equalsIgnoreCase(ingreOri.getNumDoc())) {
                        verificado = false;
                    }
                }
                if (verificado) {
                    listaVerificada.add(ingre);
                }

            }
        }
        return listaVerificada;
    }

    public List<Ingresante> evitarDocDuplicadosPaso1(List<Ingresante> base, List<Ingresante> aCargar) {
        List<Ingresante> listaVerificada = new ArrayList<>();
        var verificado = true;
        Ingresante ingresante = new Ingresante();
        for (Ingresante aCar : aCargar) {
            verificado = true;
            ingresante = aCar;
            for (Ingresante bas : base) {
                if (aCar.getNumDoc().equalsIgnoreCase(bas.getNumDoc())) {
                    verificado = false;
                }

            }
            if (verificado) {
                listaVerificada.add(ingresante);
            }

        }
        return listaVerificada;
    }

}
