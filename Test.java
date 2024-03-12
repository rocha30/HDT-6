
class CardManagerTest {

    @Test
    void testHashMapCardManager() {
        ManejoCartas<String, Carta> ManejoCartas = new Hashmap();

        // Agrega pruebas específicas para HashMapCardManager
        assertNotNull((Carta) ManejoCartas);

        // Prueba de agregar una carta y recuperarla
        Carta card = new Carta("Ejemplo", "TipoEjemplo");
        ManejoCartas.addCarta("Ejemplo", card);
        Carta retrievedCard = ManejoCartas.getCarta("Ejemplo");

        assertNotNull(retrievedCard);
        assertEquals(card, retrievedCard);

       
    }

    private void assertNotNull(Carta retrievedCard) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertNotNull'");
    }

    @Test
    void testLinkedHash() {
        ManejoCartas<String, Carta> ManejoCartas = new LinkedHash();
        // Prueba de agregar una carta y recuperarla
        Carta card = new Carta("Ejemplo", "TipoEjemplo");
        ManejoCartas.addCarta("Ejemplo", card);
        Carta retrievedCard = ManejoCartas.getCarta("Ejemplo");

        assertNotNull(retrievedCard);
        assertEquals(card, retrievedCard);

       
    }

    @Test
    void testTreeMapCardManager() {
        ManejoCartas<String, Carta> ManejoCartas = new Treemap();

        // Agrega pruebas específicas para TreeMapCardManager
        assertNotNull((Carta) ManejoCartas);

        // Prueba de agregar una carta y recuperarla
        Carta card = new Carta("Ejemplo", "TipoEjemplo");
        ManejoCartas.addCarta("Ejemplo", card);
        Carta retrievedCard = ManejoCartas.getCarta("Ejemplo");

        assertNotNull(retrievedCard);
        assertEquals(card, retrievedCard);

    }

    private void assertEquals(Carta card, Carta retrievedCard) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    // Puedes agregar más métodos de prueba para otras clases o funcionalidades
}
