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

/**
 * Clase abstracta Pokemon
 */
public abstract class Pokemon {
    /**
     * Atributos de la clase Pokemon
     */
    private String nombre;
    private int n_pokedex;
    private String descripcion;
    private double altura;
    private double peso;
    private String categoria;
    private String habilidad;
    private String tipo;
    private String debilidad;

    /**
     * Constructor de la clase Pokemon
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
    public Pokemon(String nombre, int n_pokedex, String descripcion, double altura, double peso, String categoria, String habilidad, String tipo, String debilidad) {
        this.nombre = nombre;
        this.n_pokedex = n_pokedex;
        this.descripcion = descripcion;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.habilidad = habilidad;
        this.tipo = tipo;
        this.debilidad = debilidad;
    }

    /**
     * Método que obtiene el nombre
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que obtiene el número de pokedex
     *
     * @return
     */
    public int getN_pokedex() {
        return n_pokedex;
    }

    /**
     * Método que obtiene la descripción
     *
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método que obtiene la altura
     *
     * @return
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Método que obtiene el peso
     *
     * @return
     */

    public double getPeso() {
        return peso;
    }

    /**
     * Método que obtiene la categoría
     *
     * @return
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Método que obtiene la habilidad
     *
     * @return
     */
    public String getHabilidad() {
        return habilidad;
    }

    /**
     * Método que obtiene el tipo
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método que obtiene la debilidad
     *
     * @return
     */
    public String getDebilidad() {
        return debilidad;
    }

    /**
     * Método que modifica el nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que modifica el número de pokedex
     *
     * @param n_pokedex
     */
    public void setN_pokedex(int n_pokedex) {
        this.n_pokedex = n_pokedex;
    }

    /**
     * Método que modifica la descripción
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método que modifica la altura
     *
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Método que modifica el peso
     *
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Método que modifica la categoría
     *
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Método que modifica la habilidad
     *
     * @param habilidad
     */
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    /**
     * Método que modifica el tipo
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método que modifica la debilidad
     *
     * @param debilidad
     */
    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    /**
     * Método que modifica los datos de un pokemon
     *
     * @param nombre
     * @param descripcion
     * @param altura
     * @param peso
     * @param categoria
     * @param habilidad
     * @param tipo
     * @param debilidad
     */
    public void modificarPokemon(String nombre, String descripcion, double altura, double peso, String categoria, String habilidad, String tipo, String debilidad) {
        setNombre(nombre);
        setDescripcion(descripcion);
        setAltura(altura);
        setPeso(peso);
        setCategoria(categoria);
        setHabilidad(habilidad);
        setTipo(tipo);
        setDebilidad(debilidad);
    }

    /**
     * Método abstracto que obtiene los datos específicos de un pokemon
     *
     * @return
     */
    public abstract String obtenerDatosEspecificos();

}