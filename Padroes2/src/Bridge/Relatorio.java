package Bridge;
public abstract class Relatorio
{
    private PosProcessar posProcessar = new NaoFazNada();
    
    public void calcular()
    {
        System.out.println("Calculando");
    }
    
    public void buscarDados()
    {
        System.out.println("Buscando dados.");
    }
    
    public abstract void exportar();
    
    public void gerarRelatorio()
    {
        buscarDados();
        calcular();
        exportar();
        posProcessar.PorProcessar();
    }

    public PosProcessar getPosProcessar() {
        return posProcessar;
    }

    public void setPosProcessar(PosProcessar posProcessar) {
        this.posProcessar = posProcessar;
    }
    
}
