package com.alvar.practica6pmdm;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Edicion extends AppCompatActivity {
    ImageView imageView, imageView2, imageView3, imageView4, imageView5, imageView6;
    EditText txtTelefono, txtCorreo;
    String telefono, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edicion);

        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        imageView3=findViewById(R.id.imageView3);
        imageView4=findViewById(R.id.imageView4);
        imageView5=findViewById(R.id.imageView5);
        imageView6=findViewById(R.id.imageView6);
        txtTelefono=findViewById(R.id.txtTelefono);
        txtCorreo=findViewById(R.id.txtCorreo);
    }

    public void clickPersona1(View view) {
        imageView.setBackgroundColor(getResources().getColor(R.color.colorAzul));
        imageView2.setBackgroundColor(android.R.drawable.btn_default);
        imageView3.setBackgroundColor(android.R.drawable.btn_default);
        imageView4.setBackgroundColor(android.R.drawable.btn_default);
        imageView5.setBackgroundColor(android.R.drawable.btn_default);
        imageView6.setBackgroundColor(android.R.drawable.btn_default);
        telefono="telefono";
        correo="correo";
    }

    public void clickPersona2(View view) {
        imageView2.setBackgroundColor(getResources().getColor(R.color.colorAzul));
        imageView.setBackgroundColor(android.R.drawable.btn_default);
        imageView3.setBackgroundColor(android.R.drawable.btn_default);
        imageView4.setBackgroundColor(android.R.drawable.btn_default);
        imageView5.setBackgroundColor(android.R.drawable.btn_default);
        imageView6.setBackgroundColor(android.R.drawable.btn_default);
        telefono="telefono2";
        correo="correo2";
    }

    public void clickPersona3(View view) {
        imageView3.setBackgroundColor(getResources().getColor(R.color.colorAzul));
        imageView2.setBackgroundColor(android.R.drawable.btn_default);
        imageView.setBackgroundColor(android.R.drawable.btn_default);
        imageView4.setBackgroundColor(android.R.drawable.btn_default);
        imageView5.setBackgroundColor(android.R.drawable.btn_default);
        imageView6.setBackgroundColor(android.R.drawable.btn_default);
        telefono="telefono3";
        correo="correo3";
    }

    public void clickPersona4(View view) {
        imageView4.setBackgroundColor(getResources().getColor(R.color.colorAzul));
        imageView2.setBackgroundColor(android.R.drawable.btn_default);
        imageView3.setBackgroundColor(android.R.drawable.btn_default);
        imageView.setBackgroundColor(android.R.drawable.btn_default);
        imageView5.setBackgroundColor(android.R.drawable.btn_default);
        imageView6.setBackgroundColor(android.R.drawable.btn_default);
        telefono="telefono4";
        correo="correo4";
    }

    public void clickPersona5(View view) {
        imageView5.setBackgroundColor(getResources().getColor(R.color.colorAzul));
        imageView2.setBackgroundColor(android.R.drawable.btn_default);
        imageView3.setBackgroundColor(android.R.drawable.btn_default);
        imageView4.setBackgroundColor(android.R.drawable.btn_default);
        imageView.setBackgroundColor(android.R.drawable.btn_default);
        imageView6.setBackgroundColor(android.R.drawable.btn_default);
        telefono="telefono5";
        correo="correo5";
    }

    public void clickPersona6(View view) {
        imageView6.setBackgroundColor(getResources().getColor(R.color.colorAzul));
        imageView2.setBackgroundColor(android.R.drawable.btn_default);
        imageView3.setBackgroundColor(android.R.drawable.btn_default);
        imageView4.setBackgroundColor(android.R.drawable.btn_default);
        imageView5.setBackgroundColor(android.R.drawable.btn_default);
        imageView.setBackgroundColor(android.R.drawable.btn_default);
        telefono="telefono5";
        correo="correo5";
    }

    public void onClick(View view) {
        SharedPreferences prefs = getSharedPreferences("fichero_configuracion", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(telefono, txtTelefono.getText().toString());
        editor.putString(correo, txtCorreo.getText().toString());
        editor.commit();
        Toast.makeText(this,getString(R.string.datosCorrectos) , Toast.LENGTH_SHORT).show();
    }
}
