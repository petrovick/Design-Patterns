package ChainOfResponsibility;
public abstract class BuscadorDeDados
{
    private BuscadorDeDados proximo;
    
    public BuscadorDeDados(BuscadorDeDados buscadorDeDados)
    {
        proximo = buscadorDeDados;
    }
    
    public BuscadorDeDados()
    {
        proximo = null;
    }
    
    public abstract String buscaDadoEspecifico();
    
    public String getDados() throws DadoNaoEncontradoException
    {
        String dado = buscaDadoEspecifico();
        if(dado != null)
            return dado;
        else
            if(proximo == null)
                throw new DadoNaoEncontradoException();
            else
                return proximo.getDados();
    }
}
