package ChainOfResponsability;
public class BuscadorDoBanco extends BuscadorDeDados
{
    public BuscadorDoBanco(BuscadorDeDados buscadorDeDados) {
        super(buscadorDeDados);
    }
    
    public BuscadorDoBanco(){}

    @Override
    public String buscaDadoEspecifico() {
        System.out.println("Passou pelo banco.");
        return null;
    }
    
}
