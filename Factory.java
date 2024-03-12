
public class Factory {

    public ManejoCartas<String,Carta> createMap(String type) throws Exception{
        switch (type) {
            case "HashMap":
                return new Hashmap();
               
            case "LinkedHashMap":
                return new LinkedHash();
                
            case "TreeMap":
                return new Treemap();  
            default:
                return null;
        }
    }
    
}