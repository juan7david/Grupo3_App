package co.edu.upb.grupo3_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Inicio extends AppCompatActivity implements View.OnClickListener   {

    public void alert(String msg) {
        Toast.makeText(Inicio.this,msg, Toast.LENGTH_SHORT).show();
    }
    public  void procesarEvento(int opc){
        switch (opc){
            case R.id.button:
                Intent ruta1=new Intent(Inicio.this,MainActivity.class);//AQUI SE DEBE PONER EL INTENT.
                startActivity(ruta1);
                break;
            case R.id.button2:;
                Intent ruta2=new Intent(Inicio.this,Home.class);//AQUI SE DEBE PONER EL INTENT.
                startActivity(ruta2);

            break;
           case R.id.button3:;
                Intent filtro=new Intent(Inicio.this,FiltraInfo.class);//AQUI SE DEBE PONER EL INTENT.
               // startActivity(FiltraInfo);

                break;


        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Button btn1= (Button) findViewById(R.id.button);
        btn1.setOnClickListener(this);
        Button btn2= (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        Button btn3= (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        procesarEvento(v.getId());

    }
}