package es.ua.eps.optativeproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class MainActivity2AboutUs extends AppCompatActivity implements View.OnClickListener {

    Button atras;
    Button llamada;
    Button sms;
    WebView webb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    atras = (Button) findViewById(R.id.back);
    llamada = (Button) findViewById(R.id.llamada);
    sms = (Button) findViewById(R.id.sms);
    webb = (WebView) findViewById(R.id.web);

        atras.setOnClickListener(this);
        llamada.setOnClickListener(this);
        sms.setOnClickListener(this);

        webb.getSettings().setJavaScriptEnabled(true);

        webb.loadUrl("http://miltimediatarragona.com");
        webb.setWebViewClient(new WebViewClient() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.back:
                Intent IntentAtras = new Intent(MainActivity2AboutUs.this, MainActivity.class);
                startActivity(IntentAtras);
                break;

            case R.id.llamada:
                Uri llamar = Uri.parse("tel:+34628877441");
                Intent firstTry = new Intent(Intent.ACTION_DIAL, llamar);
                break;

            case R.id.sms:
                Uri sms =Uri.parse("smsto:+34628877441");
                Intent firstSms = new Intent(Intent.ACTION_SENDTO, sms);
                firstSms.putExtra("Subject" , "Add my number");
                startActivity((firstSms));
                break;





        }
    }
}



    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_about_us);

        atras = (Button) findViewById(R.id.back);
        llamada = (Button) findViewById(R.id.llamada);
        sms = (Button) findViewById(R.id.sms);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentAtras = new Intent(MainActivity2AboutUs.this, MainActivity.class);
                startActivity(IntentAtras);
            }
        });

        llamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri llamar = Uri.parse("tel:+34628877441");
                Intent firstTry = new Intent(Intent.ACTION_DIAL, llamar);

            }
        });
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri sms =Uri.parse("smsto:+34628877441");
                Intent firstSms = new Intent(Intent.ACTION_SENDTO, sms);
                firstSms.putExtra("Subject" , "Add my number");
                startActivity((firstSms));


            }
        });
    }
    */
