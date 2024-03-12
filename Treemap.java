import java.util.TreeMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Treemap implements ManejoCartas<String,Carta>{
    private TreeMap<String,Carta> cards ;
    private TreeMap<String,Carta> userCartas ;

    public Treemap() {
        this.cards = new TreeMap<String,Carta>();
        this.userCartas = new TreeMap<String,Carta>();
    }

    @Override
    public void addCarta(String key, Carta value) {
        cards.put(key, value);
    }

    @Override
    public void addUserCarta(String key, Carta value) {
        userCartas.put(key, value);
    }

    @Override
    public Carta getCarta(String key) {
        return cards.get(key);
    }

    @Override
    public Carta getCartaUser(String key) {
        return userCartas.get(key);
    }

    @Override
    public void showUserCartas() {
        for (String key : userCartas.keySet()) {
            System.out.println("Nombre: " + key + ", Tipo: " + userCartas.get(key).getType());
        }
        System.out.println("Cantidad de cartas: "+userCartas.size());  
    }

    @Override
    public void showCartas() {
        for (String key : cards.keySet()) {
            System.out.println("Nombre: " + key + ", Tipo: " + cards.get(key).getType());
        }
        
    }

    @Override
    public void showSortedUserCartas() {
        List<Map.Entry<String, Carta>> entryList = new ArrayList<>(userCartas.entrySet());
        Collections.sort(entryList, Comparator.comparing(entry -> entry.getValue().getType()));
        for (Map.Entry<String, Carta> entry : entryList) {
            System.out.println("Nombre: " + entry.getKey() + ", Tipo: " + entry.getValue().getType());
        }
        System.out.println("Cantidad de cartas: "+userCartas.size());  
    }

    @Override
    public void showSortedCartas() {
        List<Map.Entry<String, Carta>> entryList = new ArrayList<>(cards.entrySet());
        Collections.sort(entryList, Comparator.comparing(entry -> entry.getValue().getType()));
        for (Map.Entry<String, Carta> entry : entryList) {
            System.out.println("Nombre: " + entry.getKey() + ", Tipo: " + entry.getValue().getType());
        }      
    }

}

