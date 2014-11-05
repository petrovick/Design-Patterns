package ChainOfResponsability;
public class SemProximoException extends Exception
{
    @Override
    public String getMessage()
    {
        return "Não existe próximo.";
    }
    
}
