package com.brixton.leerexcel;
import org.apache.poi.ss.usermodel.*;

import java.io.File;

public class LeerExcel1 {

    public static void main(String[] args) {
        try {
            // Ruta del archivo de Excel
            String rutaArchivo = "/trabajo1.xlsx";

            // Abrir el archivo de Excel
            Workbook workbook = WorkbookFactory.create(new File(rutaArchivo));

            // Obtener la primera hoja de trabajo
            Sheet sheet = workbook.getSheetAt(0);

            // Recorrer las filas de la hoja de trabajo
            for (Row row : sheet) {
                // Recorrer las celdas de la fila
                for (Cell cell : row) {
                    // Obtener el valor de la celda
                    String valorCelda = cell.getStringCellValue();

                    // Imprimir el valor de la celda
                    System.out.print(valorCelda + "\t");
                }
                System.out.println();
            }

            // Cerrar el archivo de Excel
            workbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
