import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;
public class LeerArchivo {
    private BufferedReader lector; 
    private String linea; 
    private String partes[] = null; 
    
    public void leerArchivo(String nombreArchivo){
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split("\\|"); // Escapamos el carácter "|"
                System.out.println();
                imprimirLinea();
            }
            lector.close();
            linea = null; 
            partes = null; 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void imprimirLinea() {
        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i] + "  |  "); 
        }
    }
    

}

