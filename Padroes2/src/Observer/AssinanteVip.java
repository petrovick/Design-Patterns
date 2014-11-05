package Observer;
public class AssinanteVip implements Observer
{
    @Override
    public void notificar(String nome, float valor) {
        System.out.println("Extravip: Nome " + nome + " valor " + valor);
    }
}
