/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.Excel;

import BaseInglesFinal.demo.entity.Ingresante;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

/**
 *
 * @author jorge
 */
@Component("ingresantes-lista.xlsx")
public class IngresanteExcelExporter extends AbstractXlsxView{
     @Override
    protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        response.setHeader("Content-Disposition", "attachment; filename=\"listado-ingresantes.xlsx\"");
        Sheet hoja=workbook.createSheet("Ingresantes");
        Row filaTitulo=hoja.createRow(0);
        Cell celda=filaTitulo.createCell(0);
        celda.setCellValue("Listado de ingresantes");
         Row filaData=hoja.createRow(1);
         String[]comlunas={"id","nombre","dni"};
         for (int i = 0; i < comlunas.length; i++) {
            celda=filaData.createCell(i);
            celda.setCellValue(comlunas[i]);
        }
         List<Ingresante>Ingresantes=(List<Ingresante>)model.get("ingresante");
         int numFila=2;
         for (Ingresante in : Ingresantes) {
            filaData=hoja.createRow(numFila);
            filaData.createCell(0).setCellValue(in.getId());
            filaData.createCell(1).setCellValue(in.getNombre());
            filaData.createCell(2).setCellValue(in.getNumDoc());
            numFila++;
        }
    }
    
}


