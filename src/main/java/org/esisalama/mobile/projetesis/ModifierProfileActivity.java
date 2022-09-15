package org.esisalama.mobile.projetesis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class ModifierProfileActivity extends AppCompatActivity {

    private Button buttonMofifier;
    private EditText ancienW;
    private EditText nouveauW;
    private EditText confirmeW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_profile);


        EditText ancienW = findViewById(R.id.edittext_password_ancien);
        EditText nouveauW = findViewById(R.id.edittext_password_nouveau);
        EditText confirmeW = findViewById(R.id.edittext_password_confirme);

        Button submit = findViewById(R.id.button_login);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ancien =  ancienW.getText().toString();
                String nouveau = nouveauW.getText().toString();
                String confirmer = confirmeW.getText().toString();
                String matricule = "18BM031";
                if (ancien.equals(matricule) || ancien.equals(matricule.toLowerCase(Locale.ROOT))){
                    if (nouveau.length() == 6){
                        if (nouveau.equals(confirmer))
                        {
                            Intent intent = new Intent(ModifierProfileActivity.this, HomePageActivity.class);
                            startActivity(intent);
                            finish();
                        }else
                        {
                            Toast.makeText(
                                    ModifierProfileActivity.this,
                                    "Mot de passe different!",
                                    Toast.LENGTH_LONG
                            ).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(
                                ModifierProfileActivity.this,
                                "Mot de passe court!",
                                Toast.LENGTH_LONG
                        ).show();
                    }
                }else
                {
                    Toast.makeText(
                            ModifierProfileActivity.this,
                            "Ancien mot de passe invalide!",
                            Toast.LENGTH_LONG
                    ).show();
                }


            }
        });
    }
}