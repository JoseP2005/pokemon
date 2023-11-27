package src.dominio;

import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> pokedex;

    public Pokedex() {
        pokedex = new ArrayList<Pokemon>();
    }
    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }
    public void agregarPokemon(Pokemon pokemon) {
        pokedex.add(pokemon);
    }
    public void eliminarPokemon(int n_pokedex) {
        for (int i = 0; i < pokedex.size(); i++) {
            if (pokedex.get(i).getN_pokedex() == n_pokedex) {
                pokedex.remove(i);
            }
        }
    }
    public void mostrarPokedex() {
        for (int i = 0; i < pokedex.size(); i++) {
            System.out.println(pokedex.get(i).toString());
        }
    }

}
