package ChainOfResponsibility;
public class BuscadorEmBanco extends BuscadorDeDados
{

    public BuscadorEmBanco(BuscadorDeDados buscadorDeDados) {
        super(buscadorDeDados);
    }
    
    public BuscadorEmBanco(){}
    
    @Override
    public String buscaDadoEspecifico()
    {
        //return "Achei no banco";
        return null;
    }
}
