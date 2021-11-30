package co.edu.upb.grupo3_app.util;

import java.util.regex.*;

public class ValidacionFormulario {
    public boolean formGeneral(String departamento, String municipio, String estrato, String edad) {
        Pattern pat = Pattern.compile("(¨[a-z[A-Z[0-9]]])");
        Matcher matchb = pat.matcher(estrato);
        Matcher matcha = pat.matcher(edad);
        if (departamento == "" || municipio == "" || estrato == "" || edad == "") {
            return true;
        }  if (matcha.find() || matchb.find()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean formGraduados(String departamento, String municipio){
            Pattern pat = Pattern.compile("([|@#~€¬!$%&/()*+-_.><])");
            Matcher matcha = pat.matcher(departamento);
            Matcher matchb = pat.matcher(municipio);
            if (departamento=="" || municipio=="" ){
                return true;
            } else if (departamento.length() < 2 || municipio.length() < 2 ){
                return false;
            }else if (matcha.find() || matchb.find()) {// busca cuantas veces aparece juan, o el patron. dice cuantas veces y donde la encuentra.
                return false;
            }else{
                return true;
            }
    }
}
