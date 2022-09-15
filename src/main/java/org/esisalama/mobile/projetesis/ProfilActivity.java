package org.esisalama.mobile.projetesis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.menu_mofifier_profile){
            Intent intentModif = new Intent(this, ModifierProfileActivity.class);
            startActivity(intentModif);
            Toast.makeText(
                    ProfilActivity.this,
                    "Vous avez cliqué sur modifiez profile",
                    Toast.LENGTH_LONG
            ).show();
        }else{
            Toast.makeText(
                    ProfilActivity.this,
                    "Vous avez cliqué sur parametre",
                    Toast.LENGTH_LONG
            ).show();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return super.onCreateOptionsMenu(menu);
    }
}