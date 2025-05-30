import java.util.ArrayList;
import java.util.List;

class Jugador {
    protected String nombre;
    protected int numero;
    protected String posicion;

    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }

    public String mostrarInfo() {
        return "Jugador: " + nombre + ", Número: " + numero + ", Posición: " + posicion;
    }
}

class Portero extends Jugador {
    private String habilidadEspecial;

    public Portero(String nombre, int numero) {
        super(nombre, numero, "Portero");
        this.habilidadEspecial = "Atajadas";
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Habilidad: " + habilidadEspecial;
    }
}

class Defensa extends Jugador {
    private String habilidadEspecial;

    public Defensa(String nombre, int numero) {
        super(nombre, numero, "Defensa");
        this.habilidadEspecial = "Marcaje";
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Habilidad: " + habilidadEspecial;
    }
}

class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Jugadores:");
        for (Jugador jugador : jugadores) {
            System.out.println("- " + jugador.mostrarInfo());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Los Tigres");
        equipo.agregarJugador(new Portero("Rodrigo Suars", 1));
        equipo.agregarJugador(new Defensa("Carlos Casassa", 4));
        equipo.agregarJugador(new Jugador("rodrigo Martínez", 10, "Delantero"));
        equipo.mostrarEquipo();
    }
}