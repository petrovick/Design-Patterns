package Singleton;
public class Main {
    public static void main(String... args)
    {
        Singleton singleton = Singleton.getInstance();
        System.out.println("" + singleton.toString());
        
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("" + singleton2.toString());
        
    }
    
}
