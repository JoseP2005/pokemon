package src.dominio;

import java.io.Serializable;

public class Planta extends Pokemon implements Serializable {
    private static final long serialVersionUID = 1L;
    public Planta(String nombre, int nivel, String tipo, int vida, int ataque, int defensa, int velocidad, int ataqueEspecial, int defensaEspecial, double debilidad, double debilidadFinal) {
        super(nombre, nivel, tipo, vida, ataque, defensa, velocidad, ataqueEspecial, defensaEspecial, debilidad, debilidadFinal);
    }
    @Override
    public double calcularDebilidadFinal() {
        if(getTipo().equals("Planta")){
            setDebilidadFinal(getDebilidad()*1);
        } else if(getTipo().equals("Fuego")){
            setDebilidadFinal(getDebilidad()*2);
        } else if(getTipo().equals("Agua")){
            setDebilidadFinal(getDebilidad()*0.5);
            return getDebilidad();
        }
    }
}
