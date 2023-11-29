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

import java.io.Serializable;

/**
 * Clase Planta que hereda de Pokemon
 */
public class Planta extends Pokemon implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Constructor de la clase Planta
     *
     * @param nombre
     * @param n_pokedex
     * @param descripcion
     * @param altura
     * @param peso
     * @param categoria
     * @param habilidad
     * @param tipo
     * @param debilidad
     */
    public Planta(String nombre, int n_pokedex, String descripcion, double altura, double peso, String categoria, String habilidad, String tipo, String debilidad) {
        super(nombre, n_pokedex, descripcion, altura, peso, categoria, habilidad, "Planta", "Fuego");
    }

    /**
     * Método que obtiene los datos específicos de Planta
     *
     * @return
     */
    @Override
    public String obtenerDatosEspecificos() {
        return String.format("%s,%s", getTipo(), getDebilidad());
    }

    /**
     * Método que muestra los datos de Planta
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n" +
                "N° Pokedex: " + getN_pokedex() + "\n" +
                "Descripción: " + getDescripcion() + "\n" +
                "Altura: " + getAltura() + "\n" +
                "Peso: " + getPeso() + "\n" +
                "Categoría: " + getCategoria() + "\n" +
                "Habilidad: " + getHabilidad() + "\n" +
                "Tipo: " + getTipo() + "\n" +
                "Debilidad: " + getDebilidad() + "\n";
    }
}
