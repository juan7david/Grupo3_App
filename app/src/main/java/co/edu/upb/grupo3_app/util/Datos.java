package co.edu.upb.grupo3_app.util;

import android.app.Application;


public class Datos extends Application {
    private String[] dato;

    public Datos(String[] dato) {
        this.setDato(dato);
    }


    public String[] getDato() {
        return dato;
    }

    public void setDato(String[] dato) {
        this.dato = dato;
    }


    public void setDato(String departamento, String municipio, String estrato, String edad) {
        this.getDato()[0] = departamento;
        this.getDato()[1]= municipio;
        this.getDato()[2]=estrato;
        this.getDato()[3]=edad;
    }


    //private String[] departamento;




}
