package com.example.mauri.contadorfragmentapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by mauri on 18/12/2017.
 */

public class ContadorFragment extends Fragment {
    private Button mBotoncontar;
    private Button mBotonreiniciar;
    private EditText mcampoConteo;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
        @Nullable ViewGroup container,@Nullable Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragmento_contador,container,false);

        mcampoConteo = (EditText) v.findViewById(R.id.etiqueta_conteo);
        mBotoncontar = (Button) v.findViewById(R.id.boton_contar);
        mBotonreiniciar = (Button) v.findViewById(R.id.boton_reiniciar);

    mBotoncontar.setOnClickListener( new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String s = mcampoConteo.getText().toString();
        int cont = Integer.parseInt(s);
        int r = cont + 1;
        s = String.valueOf(r);
        mcampoConteo.setText(s);
        }
    });
        mBotonreiniciar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                mcampoConteo.setText("0");

            }
        });
        return v;







    }
}
