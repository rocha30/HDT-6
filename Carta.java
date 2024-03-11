import java.util.Objects;

public class Carta {
    private String nombre ; 
    private String tipo; 


    public Carta (String nombre, String tipo){
        this.nombre = nombre;
        this.tipo=tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return Objects.equals(nombre, carta.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}