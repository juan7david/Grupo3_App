package co.edu.upb.grupo3_app.util;

import java.util.ArrayList;

public class DataProcess {

    public String[] filtradoBasico(String[] datos, String campoDepartamento, String campoMunicipio, String campoEstrato){
        String temp[];
        ArrayList<String>salida= new ArrayList<String>();
        for (String fila:datos){// los dos puntos lo que hacen es iterar en el arreglo datos

           temp= fila.split(",");
            System.out.println(temp[1]);
            if(temp[2].equals(campoDepartamento)||temp[3].equals(campoMunicipio)||temp[6].equals(campoEstrato)){
                //System.out.println(fila);
                salida.add(fila);
            }
        }

        return salida.toArray(new String[salida.size()]);
    }

    public int cantidadHombres(String[] datosFiltrados){
        return 1;
    }

    public int cantidadMujeres(String[] datosFiltrados){
        return 1;
    }

    public float promedioEdad(String[] datosFiltrados){
        return 1;
    }

    public int modaEdad(String[] datosFiltrados){
        return  1;
    }



}
