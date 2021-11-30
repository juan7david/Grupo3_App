package co.edu.upb.grupo3_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import co.edu.upb.grupo3_app.util.ValidacionFormulario;

public class Home extends AppCompatActivity {

private ValidacionFormulario validacionFormulario;


    private Button btn_enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_enviar=findViewById(R.id.btn_buscar_graduados);
        validacionFormulario=new ValidacionFormulario();

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv1, tv2;
                tv1=findViewById(R.id.departamento_graduados);
                tv2=findViewById(R.id.municipio_graduados);
                String temp1 = tv1.getText().toString();// departamentos
                String temp2=tv2.getText().toString();//municipios
                Boolean var1=validacionFormulario.formGraduados(temp1,temp2);

                if(var1==true )  {
                    Toast.makeText(Home.this,"Resultado es"+ var1, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}