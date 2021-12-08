package co.edu.upb.grupo3_app.util;

import android.widget.Toast;

import java.util.regex.*;

import co.edu.upb.grupo3_app.MainActivity;

public class ValidacionFormulario {
    public boolean formGeneral(String departamento, String municipio, String estrato, String edad) {
        Pattern pat = Pattern.compile("(¨[a-z[A-Z]])");
        Matcher matchb = pat.matcher(estrato);
        Matcher matcha = pat.matcher(edad);
        boolean result = true;
        if (departamento == "" || municipio == "" || estrato == "" || edad == "") {
            if (matcha.find() || matchb.find()) {
                result = true;
            }
        } else {
            result = false;
        }
        return result;
    }

    public boolean formGraduados(String departamento, String municipio) {
        Pattern pat = Pattern.compile("([|@#~€¬!$%&/()*+-_.><])");
        Matcher matcha = pat.matcher(departamento);
        Matcher matchb = pat.matcher(municipio);
        if (departamento == "" || municipio == "") {
            return true;
        } else if (departamento.length() < 2 || municipio.length() < 2) {
            return false;
        } else if (matcha.find() || matchb.find()) {// busca cuantas veces aparece juan, o el patron. dice cuantas veces y donde la encuentra.
            return false;
        } else {
            return true;
        }
    }


}
    /*
    public Datos mostrarDatos(String departamento,String municipio,String estrato, String edad ){
        //Toast.makeText(MainActivity.this, "El resultado es "+departamento, Toast.LENGTH_SHORT).show();
        String otro=departamento;
        System.out.println( "el resultado es"+departamento
        return otro;
    }

    AQUI SE ESTA HACIENDO FUNCIÒN PARA VER QUE SE ESTA GUARDANDO EN LA VARIABLE, PROBABLEMENTE ALGO QUE ES FALSE, O NULL.
    */