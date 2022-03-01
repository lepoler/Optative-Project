package es.ua.eps.optativeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity2Cartelera extends AppCompatActivity implements View.OnClickListener{

    Button accion;
    Button horror;
    Button romance;
    Button fiction;
    Button española;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_cartelera);

        accion = (Button) findViewById(R.id.accion);
        horror = (Button) findViewById(R.id.horror);
        romance = (Button) findViewById(R.id.romance);
        fiction = (Button) findViewById(R.id.fiction);
        española = (Button) findViewById(R.id.española);


        accion.setOnClickListener(this);
        horror.setOnClickListener(this);
        romance.setOnClickListener(this);
        fiction.setOnClickListener(this);
        española.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case(R.id.accion):
                Intent IntentAccion = new Intent(MainActivity2Cartelera.this, MainActivityAccion.class);
                startActivity(IntentAccion);
                break;

            case(R.id.horror):
                Intent IntentHorror = new Intent(MainActivity2Cartelera.this, MainActivity.class);
                startActivity(IntentHorror);
                break;


        }


        }

    }
