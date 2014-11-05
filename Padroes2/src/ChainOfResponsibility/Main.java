package ChainOfResponsibility;
public class Main
{
    public static void main(String... args)
    {
        BuscadorDeDados buscadorRemoto = new BuscadorRemoto(null);
        BuscadorDeDados buscadorBD = new BuscadorEmBanco(buscadorRemoto);
        BuscadorDeDados buscadorMemoria = new BuscadorEmBanco(buscadorBD);
        try
        {
            System.out.println("Dado:" + buscadorMemoria.getDados());
        }
        catch(DadoNaoEncontradoException ex)
        {
            System.err.println("" + ex.getMessage());
        }
    }
}
