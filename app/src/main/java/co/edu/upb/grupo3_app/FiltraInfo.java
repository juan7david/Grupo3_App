package co.edu.upb.grupo3_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.Arrays;

import co.edu.upb.grupo3_app.util.DataProcess;

//En esta Actividad vamos a imprimir los arrays con la clase DataProcess que hace los filtros y las estadisticas.
public class FiltraInfo extends AppCompatActivity {

    private DataProcess procesador_datos;
    private DataProcess procesador_datos1;

    private  String[] usuarios  ;
    private LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtra_info);


        String [][] datos= new String[3][7];
        datos[0][0]= "Antioquia";
        datos[0][1]= "Medellin";
        datos[0][2]= "Aspirante";
        datos[0][3]= "15";
        datos[0][4]= "3";
        datos[0][5]= "M";
        datos[0][6]= "1";


        datos[1][0]= "Antioquia";
        datos[1][1]= "Medellin";
        datos[1][2]= "Aspirante";
        datos[1][3]= "15";
        datos[1][4]= "3";
        datos[1][5]= "M";
        datos[1][6]= "2";



        datos[2][0]= "Valle";
        datos[2][1]= "Cali";
        datos[2][2]= "Aspirante";
        datos[2][3]= "22";
        datos[2][4]= "4";
        datos[2][5]= "f";
        datos[2][6]= "1";

        procesador_datos1= new DataProcess();
        String[][] resp1=procesador_datos1.filtrar(datos,"","","");
     /*   System.out.println(Arrays.toString(resp1));
        for ( String [][] fila:resp1){//aqui hay que recorrer la matriz nuevamente.

            ll.addView(crearFila(fila));
        }
*/

        ll= findViewById(R.id.datos);
       usuarios= new String[5];
        usuarios[0]= "1,Ana,Antioquia,Medellin, 2, 28,4, F,ruta 2";
        usuarios[1]= "2,Juan,Antioquia,Medellin, 1, 18,4, M,ruta 1";
        usuarios[2]= "3,Maria,Bogota,Medellin, 2, 28,3, F,ruta 2";
        usuarios[3]= "4,Laura,Valle,Cali, 2, 28,3, F,ruta 1";
        usuarios[4]= "5,Esteban,Valle,Cali, 2, 28,2, M,ruta 2";

        procesador_datos=new DataProcess();
        String [] resp=procesador_datos.filtradoBasico(usuarios, "Antioquia","","4");
        System.out.println(Arrays.toString(resp));

        for ( String fila:resp){

            ll.addView(crearFila(fila));
        }
    }



    // aqui se esta imprimiendo las posiciones 0,1,2 de las filas filtradas, ejemplo 1,Ana Antioquia, y 2 Ana Antioquia
    //falta verificar que se debe imprimir.
    @NonNull
    private LinearLayout crearFila(String fila) {
        LinearLayout llh= new LinearLayout((this));
        String datos[] = fila.split(",");
        EditText t1,t2,t3;
        llh.setOrientation(LinearLayout.HORIZONTAL);


        t1= new EditText(this);
        t1.setText(datos[0]);
        llh.addView(t1);

        t2= new EditText(this);
        t2.setText(datos[1]);

        llh.addView(t2);

        t3= new EditText(this);
        t3.setText(datos[2]);

        llh.addView(t3);
        return llh;
    }
}