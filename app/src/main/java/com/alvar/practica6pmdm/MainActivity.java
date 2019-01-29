package com.alvar.practica6pmdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickPersona(View view1) {
        Intent intent = new Intent (view1.getContext(), Contactos.class);
        startActivityForResult(intent, 0);
    }

    public void clickBloc(View view2) {
        Intent intent = new Intent (view2.getContext(), Notepad.class);
        startActivityForResult(intent, 0);
    }
}
