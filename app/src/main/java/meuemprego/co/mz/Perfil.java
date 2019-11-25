package meuemprego.co.mz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Perfil extends AppCompatActivity {

    String id_user = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            id_user = bundle.getString("id");
        }
        buscarUsuarios();

    }

    private void buscarUsuarios() {
    }
}
