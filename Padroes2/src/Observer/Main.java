package Observer;
public class Main
{
    public static void main(String... args)
    {
        Observer o = new AssinanteExtraVip();
        Observer o1 = new AssinanteVip();
        Editora e = new Editora("java", 100);
        e.addObserverList(o);
        e.addObserverList(o1);
        e.notificarTodos();
    }
}
