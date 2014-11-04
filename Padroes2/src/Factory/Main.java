package Factory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String... args)
    {
        Factory f = new Factory();
        Carro c = null;
        try {
            c = f.fabricarCarro("paalio");
            c.nomeCarro();
        } catch (Exception ex) {
            System.out.println(""+ ex.getMessage());
        }
        
    }
    
}
