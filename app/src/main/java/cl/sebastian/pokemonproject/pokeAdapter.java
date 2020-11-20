package cl.sebastian.pokemonproject;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class pokeAdapter extends RecyclerView.Adapter<pokeAdapter.PokeVH> {

    private List<Pokemon> pokemonList;

    public pokeAdapter(List<Pokemon> pokelist) {
        pokemonList = pokelist;
    }


    @NonNull
    @Override
    public pokeAdapter.PokeVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_list_pokemon, parent, false);
        return new PokeVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull pokeAdapter.PokeVH holder, int position) {
        Pokemon pokemon = pokemonList.get(position);
        holder.bind(pokemon);
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();

    }

    public class PokeVH extends RecyclerView.ViewHolder {
        private TextView TvName;

        public PokeVH(@NonNull View itemView) {
            super(itemView);
            TvName= itemView.findViewById(R.id.TvName);
        }

        public void bind(Pokemon pokemon) {
            TvName.setText(pokemon.getName());

        }
    }


}

