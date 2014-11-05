package ChainOfResponsability;
public abstract class BuscadorDeDados
{
    private BuscadorDeDados proximo;
    public BuscadorDeDados(BuscadorDeDados buscadorDeDados)
    {
        this.proximo = buscadorDeDados;
    }
    public BuscadorDeDados()
    {
        proximo = null;
    }
    
    public abstract String buscaDadoEspecifico();
    
    public String getDado() throws SemProximoException
    {
        String dado = buscaDadoEspecifico();
        if(dado != null)
            return dado;
        else
            if(proximo == null)
                throw new SemProximoException();
            else
                return proximo.getDado();
    }
}
