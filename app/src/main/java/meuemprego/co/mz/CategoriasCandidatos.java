package meuemprego.co.mz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import meuemprego.co.mz.model.Usuario;
import meuemprego.co.mz.rv.Rv_usuarios;

public class CategoriasCandidatos extends AppCompatActivity {

    List<Usuario> usuarioList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias_candidatos);

        buscarUsuarios();
    }

    private void buscarUsuarios() {

        Usuario usuario = new Usuario();
        usuario.setDescricao("Descricao vai ficar aqui...");
        usuario.setImg("image");
        usuario.setLocalizacao("Maputo");
        usuario.setNome("Eusebio");
        usuario.setProficao("Programador");
        usuario.setPosicao(1);
        usuario.setTempo("20:10");

        for (int i = 0 ; i <= 10 ; i++){
            usuarioList.add(usuario);
        }


        RecyclerView recyclerView = findViewById(R.id.rv_user);
        Rv_usuarios user = new Rv_usuarios(CategoriasCandidatos.this , usuarioList );
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(user);

    }
}
