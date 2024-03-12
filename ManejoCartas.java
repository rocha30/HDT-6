
public interface ManejoCartas<K,V> {
    
    public void addCarta(K key, V value);
    public void addUserCarta(K key, V value);
    public V getCarta(K key);
    public V getCartaUser(K key);
    public void showUserCartas();
    public void showCartas();
    public void showSortedUserCartas();
    public void showSortedCartas();
    

}