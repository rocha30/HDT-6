import java.util.*;

// Clase para representar la colección de cartas del usuario
class ColeccionCartas {
    private Map<Carta, Integer> cartas;

    public ColeccionCartas() {
        cartas = new TreeMap<>(); // Puedes cambiar esto por TreeMap o LinkedHashMap según la elección del usuario
    }

    // Agregar una carta a la colección
    public void agregarCarta(Carta carta) {
        cartas.put(carta, cartas.getOrDefault(carta, 0) + 1);
    }

    // Mostrar el tipo de una carta específica
    public String obtenerTipo(String nombreCarta) {
        for (Carta carta : cartas.keySet()) {
            if (carta.getNombre().equalsIgnoreCase(nombreCarta)) {
                return carta.getTipo();
            }
        }
        return "Carta no encontrada";
    }

    // Mostrar todas las cartas en la colección
    public void mostrarColeccion() {
        for (Map.Entry<Carta, Integer> entry : cartas.entrySet()) {
            Carta carta = entry.getKey();
            int cantidad = entry.getValue();
            System.out.println("Nombre: " + carta.getNombre() + ", Tipo: " + carta.getTipo() + ", Cantidad: " + cantidad);
        }
    }

    // Mostrar todas las cartas ordenadas por tipo
    public void mostrarColeccionOrdenadaPorTipo() {
        List<Carta> listaOrdenada = new ArrayList<>(cartas.keySet());
        listaOrdenada.sort(Comparator.comparing(Carta::getTipo).thenComparing(Carta::getNombre));

        for (Carta carta : listaOrdenada) {
            int cantidad = cartas.get(carta);
            System.out.println("Nombre: " + carta.getNombre() + ", Tipo: " + carta.getTipo() + ", Cantidad: " + cantidad);
        }
    }
}
