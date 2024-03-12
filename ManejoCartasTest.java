import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CardManagerTest {

    @Test
    void testHashMapCardManager() {
        ManejoCartas<String, Carta> ManejoCartas = new Hashmap();

        // Agrega pruebas específicas para HashMapCardManager
        assertNotNull((Carta) ManejoCartas);
        // ...

        // Prueba de agregar una carta y recuperarla
        Carta card = new Carta("Ejemplo", "TipoEjemplo");
        ManejoCartas.addCarta("Ejemplo", card);
        Carta retrievedCard = ManejoCartas.getCarta("Ejemplo");

        assertNotNull(retrievedCard);
        assertEquals(card, retrievedCard);

        // Agrega más pruebas según sea necesario para HashMapCardManager
    }

    private void assertNotNull(Carta retrievedCard) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertNotNull'");
    }

    @Test
    void testLinkedHashMapCardManager() {
        ManejoCartas<String, Carta> ManejoCartas = new LinkedHash();

        // Agrega pruebas específicas para LinkedHashMapCardManager
        assertNotNull(ManejoCartas);
        // ...

        // Prueba de agregar una carta y recuperarla
        Carta card = new Carta("Ejemplo", "TipoEjemplo");
        ManejoCartas.addCarta("Ejemplo", card);
        Carta retrievedCard = ManejoCartas.getCarta("Ejemplo");

        assertNotNull(retrievedCard);
        assertEquals(card, retrievedCard);

        // Agrega más pruebas según sea necesario para LinkedHashMapCardManager
    }

    @Test
    void testTreeMapCardManager() {
        ManejoCartas<String, Carta> ManejoCartas = new Treemap();

        // Agrega pruebas específicas para TreeMapCardManager
        assertNotNull((Carta) ManejoCartas);
        // ...

        // Prueba de agregar una carta y recuperarla
        Carta card = new Carta("Ejemplo", "TipoEjemplo");
        ManejoCartas.addCarta("Ejemplo", card);
        Carta retrievedCard = ManejoCartas.getCarta("Ejemplo");

        assertNotNull(retrievedCard);
        assertEquals(card, retrievedCard);

        // Agrega más pruebas según sea necesario para TreeMapCardManager
    }

    private void assertEquals(Carta card, Carta retrievedCard) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    // Puedes agregar más métodos de prueba para otras clases o funcionalidades
}
