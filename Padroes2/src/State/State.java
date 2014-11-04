package State;

public class State {
    public static void main(String[] args)
    {
        Livro l1 = new Livro("Java");
        l1.solicitar();
        l1.solicitar();
        
        l1.devolver();
        l1.devolver();
    }
    
}
