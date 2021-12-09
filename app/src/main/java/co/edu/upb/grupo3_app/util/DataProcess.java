package co.edu.upb.grupo3_app.util;

import java.util.*;

public class DataProcess {

    public static String[][] convertir(ArrayList<String[]> array){
        String salida[][]=null;
        if(array != null && array.size()>0){
            salida=new String[array.size()][7];
            for(int i=0;i<array.size();i++) {
                for (int j = 0; j < 7; j++) {
                    salida[i][j] = array.get(i)[j];
                    System.out.println(salida[i][j]);
                }
                System.out.println();
            }
        }
    return salida;//aqui estaba antes null, pq no devolvia nada, pero necesito que en FiltraInfo si retorne la matriz
        //para poderla recorrer e imprimir en en layaout que se hizo.

    }





   /* public String[] filtradoBasico(String[] datos, String campoDepartamento, String campoMunicipio, String campoEstrato){


        return null;
    }
*/


    public  String [][] filtrar(String[][] datos, String filtro1,String filtro2, String filtro3){
    ArrayList<String []> salida= new ArrayList<String[]>();
    String temp[];

        for (int i=0;i<datos.length;i++){
            //temp=new String[7];
            /*for (int j=0;j<datos[0].length;j++){
                System.out.print(datos[i][j]+" ");
            }
            System.out.println();*/
            if(datos[i][0].equals(filtro1)){
              salida.add(new String[]{datos[i][0],datos[i][1],datos[i][2],datos[i][3],datos[i][4],datos[i][5],datos[i][6],datos[i][7]});
            }
        }
        System.out.println(salida.size());
        convertir(salida);
        return convertir(salida);
    }



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
