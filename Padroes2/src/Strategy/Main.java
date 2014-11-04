package Strategy;
public class Main
{
    public static void main(String... args)
    {
        Humano h = new Brasileiro();
        h.getJeitoDeComer().comer();
        h.setJeitoDeComer(new Hashi());
        h.getJeitoDeComer().comer();
        h = new Chines();
        h.getJeitoDeComer().comer();
    }
    
}
