package co.edu.upb.grupo3_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.KeyStore;

import co.edu.upb.grupo3_app.util.Datos;
import co.edu.upb.grupo3_app.util.ValidacionFormulario;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private ValidacionFormulario validacion_formulario;
    private Datos datos;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        validacion_formulario= new ValidacionFormulario();

        EditText plainText_departamento=(EditText) findViewById(R.id.departamento);

        EditText plainText_municipio=(EditText) findViewById(R.id.municipio);
        EditText plainText_estrato=(EditText) findViewById(R.id.estrato);
        EditText plainText_edad=(EditText) findViewById(R.id.edad);

        String departamento= plainText_departamento.getText().toString();
        String municipio= plainText_municipio.getText().toString();
        String estrato= plainText_estrato.getText().toString();
        String edad= plainText_edad.getText().toString();

        ValidacionFormulario llamada= new ValidacionFormulario();
        llamada.formGeneral(departamento,municipio,estrato,edad);

        //datos=((Datos)getApplication());
        //datos.setDato(departamento,municipio,estrato,edad);

        //validacion_formulario.formGraduados(departamento,municipio); // esto me trae un true o false

        //hago la logica con if, para ver que pasa si el boton es false o true. esto lo pongo en el boton.


        btn1=findViewById(R.id.btn1);
        try {

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (validacion_formulario.formGeneral(departamento,municipio,estrato,edad) == true){
                         Toast.makeText(MainActivity.this, "El resultado es True", Toast.LENGTH_SHORT).show();

                }

                    else   {
                        Toast.makeText(MainActivity.this, "El resultado es False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }catch (NullPointerException e){
            Toast.makeText(MainActivity.this,"Error Null",Toast.LENGTH_LONG ).show();
            Toast.makeText(MainActivity.this,"Otro tipo de error",Toast.LENGTH_LONG ).show();
        }
        catch (Exception e){// exception es la clase padre de todos los errores en java.
            Toast.makeText(MainActivity.this,""+e.getMessage(),Toast.LENGTH_LONG ).show();
            Toast.makeText(MainActivity.this,"Otro tipo de error",Toast.LENGTH_LONG ).show();

        }
        finally {
            Toast.makeText(MainActivity.this,"Esto se ejecuta, siempre",Toast.LENGTH_LONG ).show();
        }

    }
}