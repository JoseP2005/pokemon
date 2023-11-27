package src.dominio;

public abstract class Pokemon {
    private String nombre;
    private int n_pokedex;
    private String descripcion;
    private double altura;
    private double peso;
    private String categoria;
    private String habilidad;
    private String tipo;
    private String debilidad;

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
    public String getNombre() {
        return nombre;
    }
    public int getN_pokedex() {
        return n_pokedex;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getHabilidad() {
        return habilidad;
    }
    public String getTipo() {
        return tipo;
    }
    public String getDebilidad() {
        return debilidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setN_pokedex(int n_pokedex) {
        this.n_pokedex = n_pokedex;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }
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
    public abstract String obtenerDatosEspecificos();

}