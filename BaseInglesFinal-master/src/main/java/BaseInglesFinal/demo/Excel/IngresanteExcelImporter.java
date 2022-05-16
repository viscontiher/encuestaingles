/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.Excel;

import BaseInglesFinal.demo.entity.Examen;
import BaseInglesFinal.demo.entity.Ingresante;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author jorge
 */
@Component
public class IngresanteExcelImporter {

    public List<Ingresante> excelImport(MultipartFile file) {
        List<Ingresante> listaIngresante = new ArrayList<>();

        //String excelFilePath = "C:\\Users\\jorge\\Desktop\\libro1.xlsx";
        long start = System.currentTimeMillis();

        FileInputStream inputStream;
        try {
            inputStream = (FileInputStream) file.getInputStream();
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = firstSheet.iterator();
            rowIterator.next();

            while (rowIterator.hasNext()) {
                Row nextRow = rowIterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();
                /**
                 * **************Datos Duros********************************
                 */
                Long id = null;
                String mail = null;
                Long celu = null;
                String tDoc = null;
                String numDoc = null;
                String apellido = null;
                String nombre = null;
                String fNacimiento = null;
                String genero = null;
                String nacionalidad = null;
                String pais = null;
                String provincia = null;
                String localidadResi = null;
                String domicilio = null;
                Boolean d_estado = false;
                /**
                 * **************Tayectoria
                 * Educativa********************************
                 */
                String e_nivelMaximo = null;
                String e_egresadoDe = null;
                String e_establecimiento = null;
                Integer e_anioEgreso = null;
                Boolean e_estado = false;
                /**
                 * **************Situacion
                 * Laboral********************************
                 */
                String t_situacionActual = null;
                String t_relacion = null;
                String t_actividadPrincipal = null;
                String t_roles = null;
                String t_duracion = null;
                Integer t_antiguedad = null;
                Integer t_añosDelSector = null;
                String t_aportesJ = null;
                String t_plataPara = null;
                String t_horas = null;
                String t_franja = null;
                Boolean t_estado = false;
                /**
                 * **************nivel Ingles********************************
                 */
                String i_estudiaste = null;
                String i_donde = null;
                String i_nivel_oral = null;
                String i_nivel_escrito = null;
                String i_nivel_lectura = null;
                String i_uso_trabajo = null;
                String i_uso_t_situacion = null;
                String i_conseguirOportunidades = null;
                String i_programacion = null;
                String i_cercerProfecionalmente = null;
                String i_valorTiempo = null;
                Boolean i_estado = null;
                Examen examen = null;
                while (cellIterator.hasNext()) {
                    Cell nextCell = cellIterator.next();
                    int columnIndex = nextCell.getColumnIndex();
                    switch (columnIndex) {

                        case 0:
                            System.out.println(nextCell.getCellType()+" id "+nextCell.getNumericCellValue());
                            id=(long)nextCell.getNumericCellValue();
                            
                            break;
                        case 1:
                            System.out.println(nextCell.getCellType()+" nombre "+nextCell.getStringCellValue());
                            nombre=nextCell.getStringCellValue();
                            
                            break;
                        case 2:
                            System.out.println(nextCell.getCellType()+" apellido "+nextCell.getStringCellValue());
                            apellido=nextCell.getStringCellValue();
                            
                            break;
                        case 3:
                            
                            
                            if (nextCell.getCellType().toString().equalsIgnoreCase("STRING")) {
                               numDoc=nextCell.getStringCellValue(); 
                               System.out.println(nextCell.getCellType()+" numDoc "+nextCell.getStringCellValue());
                            }
                            if (nextCell.getCellType().toString().equalsIgnoreCase("NUMERIC")) {
                               Long num=(long)nextCell.getNumericCellValue();
                                System.out.println(num);
                                numDoc=num.toString();
                               System.out.println(nextCell.getCellType()+" numDoc "+nextCell.getNumericCellValue());
                            }
                            
                            
                            break;
                        case 4:
                            System.out.println(nextCell.getCellType()+" email "+nextCell.getStringCellValue());
                            mail=nextCell.getStringCellValue();
                            
                            break;
                        case 5:
                            System.out.println(nextCell.getCellType()+" e_egresadoDe "+nextCell.getStringCellValue());
                            e_egresadoDe=nextCell.getStringCellValue();
                            
                            break;
                        case 6:
                            System.out.println(nextCell.getCellType()+" e_establecimiento "+nextCell.getStringCellValue());
                            e_establecimiento=nextCell.getStringCellValue();
                            
                            break;
                        
                    }

                }
                listaIngresante.add(new Ingresante(id, mail, numDoc, apellido, nombre, e_egresadoDe, e_establecimiento));
            }

            workbook.close();
            long end = System.currentTimeMillis();
            System.out.printf("Import done in %d ms\n", (end - start));

        } catch (Exception e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        }
        System.out.println("El tamañ de la lista antes de enviar es " + listaIngresante.size());
        return listaIngresante;
    }

}
