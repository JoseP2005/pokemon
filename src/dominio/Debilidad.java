package src.dominio;

public class Debilidad {
    private String tipo;
    private double debilidad;

    public Debilidad(String tipo, double debilidad) {
        this.tipo = tipo;
        this.debilidad = debilidad;
    }

    public String getTipo() {
        return tipo;
    }

    public double getDebilidad() {
        return debilidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDebilidad(double debilidad) {
        this.debilidad = debilidad;
    }

}
