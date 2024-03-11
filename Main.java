import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ColeccionCartas coleccion = new ColeccionCartas();
        LeerArchivo  archivo = new LeerArchivo();
        archivo.leerArchivo("C:\\Users\\maroc\\OneDrive - Colegio Jacques Cousteu\\Documentos\\VisualEstudio\\Java\\HDT 6\\cards_desc.txt");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Menú:");
                System.out.println("1. Agregar una carta");
                System.out.println("2. Mostrar el tipo de una carta específica");
                System.out.println("3. Mostrar la colección completa");
                System.out.println("4. Mostrar la colección ordenada por tipo");
                System.out.println("5. Mostrar todas las cartas existentes");
                System.out.println("6. Mostrar todas las cartas existentes ordenadas por tipo");
                System.out.println("0. Salir");
                System.out.print("Ingrese una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la línea vacía después de leer el número

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nombre de la carta: ");
                        String nombre = scanner.nextLine();
                        // Validar si la carta existe en las disponibles antes de agregarla
                        // ...
                        coleccion.agregarCarta(new Carta(nombre, "Tipo")); // Reemplaza "Tipo" con el tipo real
                        break;
                    case 2:
                        System.out.print("Ingrese el nombre de la carta: ");
                        String nombreBuscado = scanner.nextLine();
                        System.out.println("Tipo: " + coleccion.obtenerTipo(nombreBuscado));
                        break;
                    case 3:
                        System.out.println("Colección completa:");
                        coleccion.mostrarColeccion();
                        break;
                    case 4:
                        System.out.println("Colección ordenada por tipo:");
                        coleccion.mostrarColeccionOrdenadaPorTipo();
                        break;
                    case 5:
                        System.out.println("Todas las cartas existentes:");
                        // Mostrar todas las cartas disponibles (lee el archivo o utiliza una lista predefinida)
                        // ...
                        break;
                    case 6:
                        System.out.println("Todas las cartas existentes ordenadas por tipo:");
                        // Mostrar todas las cartas disponibles ordenadas por tipo
                        // ...
                        break;
                    case 0:
                        System.out.println("¡Hasta luego!");
                        return;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            }
        }

        

    }
}