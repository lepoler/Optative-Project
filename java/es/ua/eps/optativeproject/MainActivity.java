package es.ua.eps.optativeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

TextView pantalla1;
Button cartelera;
Button aboutUs;
Button contacto;
EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla1 = (TextView) findViewById(R.id.pantalla1);
        cartelera = (Button) findViewById(R.id.cartelera);
            aboutUs = (Button) findViewById(R.id.aboutUs);
        contacto = (Button) findViewById(R.id.contacto);
        editText = (EditText) findViewById(R.id.editText);


      cartelera.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            Intent IntentCartelera = new Intent(MainActivity.this, MainActivity2AboutUs.class);
            startActivity(IntentCartelera);

          }


      });
      aboutUs.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent IntentAbout = new Intent(MainActivity.this, MainActivity2AboutUs.class);
              startActivity(IntentAbout);
          }
      });

      editText.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Toast.makeText(getApplicationContext(),"CAPITAL LETTERS, PLEASE", Toast.LENGTH_SHORT).show();

          }
      });



    }
}