package src.dominio;

public abstract class Pokemon {
    private String nombre;
    private int nivel;
    private String tipo;
    private int vida;
    private int ataque;
    private int defensa;
    private int velocidad;
    private int ataqueEspecial;
    private int defensaEspecial;
    private double debilidad;
    private double debilidadFinal;

    public Pokemon(String nombre, int nivel, String tipo, int vida, int ataque, int defensa, int velocidad, int ataqueEspecial, int defensaEspecial, double debilidad, double debilidadFinal) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.debilidad = debilidad;
        this.debilidadFinal = debilidadFinal;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNivel() {
        return nivel;
    }
    public String getTipo() {
        return tipo;
    }
    public int getVida() {
        return vida;
    }
    public int getAtaque() {
        return ataque;
    }
    public int getDefensa() {
        return defensa;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }
    public int getDefensaEspecial() {
        return defensaEspecial;
    }
    public double getDebilidad() {
        return debilidad;
    }
    public double getDebilidadFinal() {
        return debilidadFinal;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }
    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }
    public void setDebilidad(double debilidad) {
        this.debilidad = debilidad;
    }
    public void setDebilidadFinal(double debilidadFinal) {
        this.debilidadFinal = debilidadFinal;
    }
    public abstract double calcularDebilidad();
}