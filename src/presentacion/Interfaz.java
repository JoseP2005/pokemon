package src.presentacion;

import src.dominio.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interfaz {
    private static final long serialVersionUID = 1L;

    private List<Pokemon> pokedex;
    private Scanner sc;

    public Interfaz() {
        pokedex = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void iniciarPrograma() {
        cargarDatos();

        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    crearPokemonPlanta();
                    break;
                case 2:
                    crearPokemonAgua();
                    break;
                case 3:
                    crearPokemonFuego();
                    break;
                case 4:
                    mostrarInformacion();
                case 5:
                    modificarPokemon();
                    break;
                case 6:
                    mostrarPokedex();
                    break;
                case 7:
                    guardarDatos();
                    System.out.println("Programa terminado.");
                    break;
                case 8:
                    System.out.println("Gracias por utilizar el programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 8);
    }


    private void mostrarMenu() {
        System.out.println("----------- MENÚ -----------");
        System.out.println("1. Crear Pokemon tipo Planta");
        System.out.println("2. Crear Pokemon tipo Fuego");
        System.out.println("3. Crear Pokemon tipo Agua");
        System.out.println("4. Mostrar información de un Pokemon");
        System.out.println("5. Modificar Pokemon");
        System.out.println("6. Mostrar Pokedex");
        System.out.println("7. Guardar datos");
        System.out.println("8. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private void crearPokemonPlanta() {
        System.out.print("\nIngrese la cantidad de Pokemon tipo Planta que desea añadir: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- CREANDO POKEMON TIPO PLANTA " + (i + 1) + " ---");
            System.out.print("Ingrese el nombre del Pokemon: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el número de la Pokedex: ");
            int n_pokedex = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese la descripción del Pokemon: ");
            String descripcion = sc.nextLine();
            System.out.print("Ingrese la altura del Pokemon: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese el peso del Pokemon: ");
            double peso = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese la categoría del Pokemon: ");
            String categoria = sc.nextLine();
            System.out.print("Ingrese la habilidad del Pokemon: ");
            String habilidad = sc.nextLine();

            Pokemon planta = new Planta(nombre, n_pokedex, descripcion, altura, peso, categoria, habilidad, "Planta", "Fuego");

            System.out.println("Pokemon tipo planta creado: " + planta);

            agregarPokemon(planta);
        }

    }

    private void crearPokemonFuego() {
        System.out.print("\nIngrese la cantidad de Pokemon tipo Fuego que desea añadir: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- CREANDO POKEMON TIPO FUEGO " + (i + 1) + " ---");
            System.out.print("Ingrese el nombre del Pokemon: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el número de la Pokedex: ");
            int n_pokedex = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese la descripción del Pokemon: ");
            String descripcion = sc.nextLine();
            System.out.print("Ingrese la altura del Pokemon: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese el peso del Pokemon: ");
            double peso = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese la categoría del Pokemon: ");
            String categoria = sc.nextLine();
            System.out.print("Ingrese la habilidad del Pokemon: ");
            String habilidad = sc.nextLine();

            Pokemon fuego = new Fuego(nombre, n_pokedex, descripcion, altura, peso, categoria, habilidad, "Planta", "Fuego");

            System.out.println("Pokemon tipo fuego creado: " + fuego);

            agregarPokemon(fuego);
        }
    }
    private void crearPokemonAgua() {
        System.out.print("\nIngrese la cantidad de Pokemon tipo Agua que desea añadir: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- CREANDO POKEMON TIPO AGUA " + (i + 1) + " ---");
            System.out.print("Ingrese el nombre del Pokemon: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el número de la Pokedex: ");
            int n_pokedex = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese la descripción del Pokemon: ");
            String descripcion = sc.nextLine();
            System.out.print("Ingrese la altura del Pokemon: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese el peso del Pokemon: ");
            double peso = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese la categoría del Pokemon: ");
            String categoria = sc.nextLine();
            System.out.print("Ingrese la habilidad del Pokemon: ");
            String habilidad = sc.nextLine();

            Pokemon agua = new Agua(nombre, n_pokedex, descripcion, altura, peso, categoria, habilidad, "Agua", "Planta");

            System.out.println("Pokemon tipo agua creado: " + agua);

            agregarPokemon(agua);
        }
    }

    private void mostrarPokedex() {
        System.out.println("\n--- POKEDEX ---");
        for (Pokemon pokemon : pokedex) {
            System.out.println(pokemon);
        }
    }

    private void mostrarInformacion() {
        if (pokedex.isEmpty()) {
            System.out.println("La Pokedex está vacío. No hay información para mostrar.");
            return;
        }

        System.out.print("\nIngrese el índice del pokemon para mostrar información: ");
        int indice = sc.nextInt();
        sc.nextLine();

        if (indice >= 0 && indice < pokedex.size()) {
            Pokemon pokemonSeleccionado = pokedex.get(indice);
            System.out.println("\n--- INFORMACIÓN DEL POKEMON ---");
            System.out.println("Nombre: " + pokemonSeleccionado.getNombre());
            System.out.println("N° Pokedex: " + pokemonSeleccionado.getN_pokedex());
            System.out.println("Descripción: " + pokemonSeleccionado.getDescripcion());
            System.out.println("Altura: " + pokemonSeleccionado.getAltura());
            System.out.println("Peso: " + pokemonSeleccionado.getPeso());
            System.out.println("Categoría: " + pokemonSeleccionado.getCategoria());
            System.out.println("Habilidad: " + pokemonSeleccionado.getHabilidad());
            if (pokemonSeleccionado instanceof Planta) {
                System.out.println("Tipo: Planta");
                System.out.println("Debilidad: Fuego");
            } else if (pokemonSeleccionado instanceof Fuego) {
                System.out.println("Tipo: Fuego");
                System.out.println("Debilidad: Agua");
            } else if (pokemonSeleccionado instanceof Agua) {
                System.out.println("Tipo: Agua");
                System.out.println("Debilidad: Planta");
            }
        }else {
            System.out.println("El índice ingresado no es válido.");
        }
    }
    private void modificarPokemon() {
        if (pokedex.isEmpty()) {
            System.out.println("La Pokedex está vacía. No hay Pokémon para modificar.");
            return;
        }

        System.out.print("\nIngrese el índice del Pokémon que desea modificar: ");
        int indice = sc.nextInt();
        sc.nextLine();

        if (indice >= 0 && indice < pokedex.size()) {
            Pokemon pokemonSeleccionado = pokedex.get(indice);

            System.out.println("\n--- MODIFICANDO POKEMON ---");
            System.out.print("Ingrese el nuevo nombre del Pokemon: ");
            String nuevoNombre = sc.nextLine();
            System.out.print("Ingrese la nueva descripción del Pokemon: ");
            String nuevaDescripcion = sc.nextLine();
            System.out.print("Ingrese la nueva altura del Pokemon: ");
            double nuevaAltura = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese el nuevo peso del Pokemon: ");
            double nuevoPeso = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese la nueva categoría del Pokemon: ");
            String nuevaCategoria = sc.nextLine();
            System.out.print("Ingrese la nueva habilidad del Pokemon: ");
            String nuevaHabilidad = sc.nextLine();
            System.out.print("Ingrese el nuevo tipo del Pokemon: ");
            String nuevoTipo = sc.nextLine();
            System.out.print("Ingrese la nueva debilidad del Pokemon: ");
            String nuevaDebilidad = sc.nextLine();

            // Llama al método modificarPokemon en la clase Pokemon
            pokemonSeleccionado.modificarPokemon(nuevoNombre, nuevaDescripcion, nuevaAltura, nuevoPeso, nuevaCategoria, nuevaHabilidad, nuevoTipo, nuevaDebilidad);

            System.out.println("Pokemon modificado: " + pokemonSeleccionado);
        } else {
            System.out.println("El índice ingresado no es válido.");
        }
    }

    private void guardarDatos() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("pokedex.csv"))) {
            for (Pokemon pokemon : pokedex) {
                writer.println(String.format("%s,%s,%s,%s,%.2f,%.2f,%s,%s,%s",
                        pokemon.getClass().getSimpleName(),
                        pokemon.getNombre(),
                        pokemon.getN_pokedex(),
                        pokemon.getDescripcion(),
                        pokemon.getAltura(),
                        pokemon.getPeso(),
                        pokemon.getCategoria(),
                        pokemon.getHabilidad(),
                        pokemon.obtenerDatosEspecificos()));

            }
            System.out.println("Datos guardados exitosamente en formato CSV.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al guardar los datos.");
        }
    }
    private void cargarDatos() {
        pokedex.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("pokedex.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 10) {
                    try {
                        String tipoPokemon = data[0];
                        String nombre = data[1];
                        int n_pokedex = Integer.parseInt(data[2]);
                        String descripcion = data[3];
                        double altura = Double.parseDouble(data[4]);
                        double peso = Double.parseDouble(data[5]);
                        String categoria = data[6];
                        String habilidad = data[7];
                        String tipo = data[8];
                        String debilidad = data[9];

                        if ("Planta".equals(tipoPokemon)) {
                            Planta planta = new Planta(nombre, n_pokedex, descripcion, altura, peso, categoria, habilidad, tipo, debilidad);
                            pokedex.add(planta);
                        } else if ("Fuego".equals(tipoPokemon)) {
                            Fuego fuego = new Fuego(nombre, n_pokedex, descripcion, altura, peso, categoria, habilidad, tipo, debilidad);
                            pokedex.add(fuego);
                        } else if ("Agua".equals(tipoPokemon)) {
                            Agua agua = new Agua(nombre, n_pokedex, descripcion, altura, peso, categoria, habilidad, tipo, debilidad);
                            pokedex.add(agua);
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Error en la línea: " + line);
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Datos cargados exitosamente desde el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al cargar los datos desde el archivo CSV.");
        }
    }
    private void agregarPokemon(Pokemon pokemon) {
        pokedex.add(pokemon);
    }
}
