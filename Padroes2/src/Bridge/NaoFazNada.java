package Bridge;
public class NaoFazNada implements PosProcessar
{

    @Override
    public void PorProcessar() {
        System.out.println("Não faz nada.");
    }
    
}
