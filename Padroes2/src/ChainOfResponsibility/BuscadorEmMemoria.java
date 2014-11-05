package ChainOfResponsibility;
public class BuscadorEmMemoria extends BuscadorDeDados
{
    Boolean existeEmMemoria = false;

    public BuscadorEmMemoria(BuscadorDeDados buscadorDeDados) {
        super(buscadorDeDados);
    }
    
    public BuscadorEmMemoria(){}
    
    @Override
    public String buscaDadoEspecifico()
    {
        if(existeEmMemoria)
            return "Memoria";
        return null;
    }
    
}
