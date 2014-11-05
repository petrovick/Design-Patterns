package ChainOfResponsability;
public class BuscadorDaMemoria extends BuscadorDeDados
{

    public BuscadorDaMemoria(BuscadorDeDados buscadorDeDados) {
        super(buscadorDeDados);
    }
    
    public BuscadorDaMemoria(){}

    @Override
    public String buscaDadoEspecifico() {
        System.out.println("Passou pela memória.");
        return null;
    }
    
    
}
