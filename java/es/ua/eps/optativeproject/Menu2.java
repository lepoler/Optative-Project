package es.ua.eps.optativeproject;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class Menu2 extends Fragment {

    Button carter2;
    Button nosort2;
    Button contactor2;
    View rootView;

    @Override
    public android.view.View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.activity_frag, container, false);

        carter2 = rootView.findViewById(R.id.frag1);
        nosort2 = rootView.findViewById(R.id.frag2);
        contactor2 = rootView.findViewById(R.id.frag3);

        carter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentCartel2 = new Intent(getActivity(), MainActivity2Cartelera.class);
                startActivity(IntentCartel2);
            }
        });

        nosort2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentNosort2 = new Intent(getActivity(), MainActivity2AboutUs.class);
                startActivity(IntentNosort2);
            }
        });

        contactor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentContact2 = new Intent(getActivity(), MainActivityAccion.class);
                startActivity(IntentContact2);
            }
        });




        return rootView;



    }





}
