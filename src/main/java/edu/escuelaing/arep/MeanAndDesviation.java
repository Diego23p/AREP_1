package edu.escuelaing.arep;

import java.io.*;
import java.util.List;

import edu.escuelaing.arep.LinkedList.LinkedList;
import edu.escuelaing.arep.Calculadora;

public class MeanAndDesviation {
	
	public static void main( String[] args ) {     
        File dataFile = null;
        if (args.length > 0){
            dataFile = new File(args[0]);
        }
        else{
            System.out.println("No selecciono ningun archivo"); 
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(dataFile));
            LinkedList<Double> linkedList = new LinkedList<>();
            String line;
            while ((line = br.readLine()) != null) {
                double num = Double.parseDouble(line);
                linkedList.add(num);
            }
            double media = Calculadora.getMean(linkedList);
            media = (double)Math.round(media * 100d) / 100d;
            double desviacion = Calculadora.getDeviation(linkedList);
            desviacion =(double)Math.round(desviacion * 100d) / 100d;
            System.out.println("La media es: "+ media);
            System.out.println("La desviacion estandar es: "+ desviacion);
            
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("No se pudo leer");
        }
    }

}
