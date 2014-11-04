package Observer;
public class AssinanteExtraVip implements Observer
{

    @Override
    public void notificar(String nome, float valor) {
        System.out.println("Extravip: Nome " + nome + " valor " + valor * 0.9);
    }
    
}
