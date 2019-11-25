package meuemprego.co.mz;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import meuemprego.co.mz.model.Categorias;
import meuemprego.co.mz.model.Usuario;
import meuemprego.co.mz.rv.Rv_categorias;
import meuemprego.co.mz.rv.Rv_usuarios;

public class MainActivity extends AppCompatActivity {

    List<Usuario> usuarioList = new ArrayList<>();
    List<Categorias> categoriasList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buscarUsuarios();
        inserirCategorias();
    }

    private void inserirCategorias() {

        categoriasList.add(new Categorias("Engenharia" , Color.MAGENTA));
        categoriasList.add(new Categorias("Agri-Cultura" , Color.GREEN));
        categoriasList.add(new Categorias("TI" , Color.CYAN));
        categoriasList.add(new Categorias("Gestao" , Color.LTGRAY));
        categoriasList.add(new Categorias("Saude" , Color.MAGENTA));

        RecyclerView recyclerView = findViewById(R.id.rv_categorias);
        Rv_categorias user = new Rv_categorias(MainActivity.this , categoriasList );
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(user);
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
        Rv_usuarios user = new Rv_usuarios(MainActivity.this , usuarioList );
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(user);

    }

}
