package com.alvar.practica6pmdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intent1, intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent1 = new Intent(this, Contactos.class);
        intent2 = new Intent(this, Notepad.class);
    }

    public void clickPersona(View view1) {
        startActivity(intent1);
    }

    public void clickBloc(View view2) {
        startActivity(intent2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.Contactos:
                startActivity(intent1);
                break;
            case R.id.Notepad:
                startActivity(intent2);
                break;
        }
        return (super.onOptionsItemSelected(item));
    }
}