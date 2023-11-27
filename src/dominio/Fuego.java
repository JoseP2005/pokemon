package src.dominio;
import java.io.Serializable;

public class Fuego extends Pokemon implements Serializable{
    private static final long serialVersionUID = 1L;
    public Fuego(String nombre, int n_pokedex, String descripcion, double altura, double peso, String categoria, String habilidad, String tipo, String debilidad) {
            super(nombre, n_pokedex, descripcion, altura, peso, categoria, habilidad, "Fuego", "Agua");
    }
    @Override
    public String obtenerDatosEspecificos() {
        return String.format("%s,%s", getTipo(), getDebilidad());
    }
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
