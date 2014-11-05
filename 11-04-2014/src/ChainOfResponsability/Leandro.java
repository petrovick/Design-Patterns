package ChainOfResponsability;
public class Leandro extends BuscadorDeDados
{

    public Leandro(BuscadorDeDados buscadorDeDados) {
        super(buscadorDeDados);
    }

    public Leandro(){}
    
    @Override
    public String buscaDadoEspecifico() {
        System.out.println("Passou no Leandro.");
        return null;
    }
    
}
