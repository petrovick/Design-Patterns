package ChainOfResponsibility;
public class DadoNaoEncontradoException extends Exception
{
    public String getMessage()
    {
        return "Dado não encontrado!";
    }
    
}
