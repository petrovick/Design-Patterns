package ChainOfResponsability;

public class BuscadorRemoto extends BuscadorDeDados
{

    public BuscadorRemoto(BuscadorDeDados buscadorDeDados) {
        super(buscadorDeDados);
    }
    
    public BuscadorRemoto(){}
            
            
    @Override
    public String buscaDadoEspecifico() {
        System.out.println("Passou pelo rest.");
        return null;
    }
    
}
