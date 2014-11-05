package ChainOfResponsibility;
public class BuscadorRemoto extends BuscadorDeDados
{

    public BuscadorRemoto(BuscadorDeDados buscadorDeDados) {
        super(buscadorDeDados);
    }
    public BuscadorRemoto(){}
            
    @Override
    public String buscaDadoEspecifico() {
        return null;
    }
}
