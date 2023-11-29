/**
 * Copyright [2023] [Jose Andres Pascual]
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied.See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dominio;

import java.util.ArrayList;

/**
 * Clase Pokedex que contiene un ArrayList de Pokemon
 */
public class Pokedex {
    /**
     * Atributo de la clase Pokedex
     */
    private ArrayList<Pokemon> pokedex;

    /**
     * Constructor de la clase Pokedex
     */
    public Pokedex() {
        pokedex = new ArrayList<Pokemon>();
    }

    /**
     * Método que obtiene la pokedex
     *
     * @return
     */
    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }

    /**
     * Método que agrega un pokemon a la pokedex
     *
     * @param pokemon
     */
    public void agregarPokemon(Pokemon pokemon) {
        pokedex.add(pokemon);
    }

    /**
     * Método que elimina un pokemon de la pokedex
     *
     * @param n_pokedex
     */
    public void eliminarPokemon(int n_pokedex) {
        for (int i = 0; i < pokedex.size(); i++) {
            if (pokedex.get(i).getN_pokedex() == n_pokedex) {
                pokedex.remove(i);
            }
        }
    }

    /**
     * Método que muestra la pokedex
     */
    public void mostrarPokedex() {
        for (int i = 0; i < pokedex.size(); i++) {
            System.out.println(pokedex.get(i).toString());
        }
    }

}
