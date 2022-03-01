package es.ua.eps.optativeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivityAccion extends AppCompatActivity {

    ImageView matrix;
    Button butonAction;
    TextView textMatrix;
    Button butonAtras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_accion);

        matrix = (ImageView) findViewById(R.id.matrix);
        butonAction = (Button) findViewById(R.id.butonAction);
        textMatrix = (TextView) findViewById(R.id.textAction);
        butonAtras = (Button) findViewById(R.id.butonBack);


        matrix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}