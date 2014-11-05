package ChainOfResponsability;

public class Main
{
    public static void main(String... args)
    {
        BuscadorDeDados leandroDado = new Leandro();
        BuscadorDeDados remoto = new BuscadorRemoto(leandroDado);
        BuscadorDeDados banco = new BuscadorDoBanco(remoto);
        BuscadorDeDados memoria = new BuscadorDaMemoria(banco);
        
        try
        {
            System.out.println("" + memoria.getDado());
        }
        catch(SemProximoException ex)
        {
            System.out.println("" + ex.getMessage());
        }
    }
    
}
