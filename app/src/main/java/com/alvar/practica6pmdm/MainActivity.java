package com.alvar.practica6pmdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickPersona(View view1) {
        Intent intent1 = new Intent(view1.getContext(), Contactos.class);
        startActivityForResult(intent1, 0);
    }

    public void clickBloc(View view2) {
        Intent intent2 = new Intent(view2.getContext(), Notepad.class);
        startActivityForResult(intent2, 0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.Contactos:
                Intent intent1 = new Intent(this, Contactos.class);
                startActivity(intent1);
                break;
            case R.id.Notepad:
                Intent intent2 = new Intent(this, Notepad.class);
                startActivity(intent2);
                break;
        }
        return (super.onOptionsItemSelected(item));
    }
}