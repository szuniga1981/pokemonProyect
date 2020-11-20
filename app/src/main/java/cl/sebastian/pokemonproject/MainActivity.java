package cl.sebastian.pokemonproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

//TODO
/*
[ ] creacion de POJOs [pokemon]
[ ]fuente de datos[pokedex]
*Adaptador
1-[]crear la clase publica adapter que extiende Recyclerview.Adapter
5-[] implementar metodo abstracto onCreateViewHolder
        []Contexto
        []LayoutInflater desde el Conexto
        Inflar la lista del Vie
 */





public class MainActivity extends AppCompatActivity {
private RecyclerView PokeRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pokeAdapter adapter = new pokeAdapter(Pokedex.getPokelist());

        PokeRecycler=findViewById(R.id.PokeRecycler);

        PokeRecycler.setAdapter(adapter);
        PokeRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

}