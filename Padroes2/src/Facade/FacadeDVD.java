package Facade;

public class FacadeDVD
{
    public void assistirOFilme()
    {
        DVD dvd = new DVD();
        dvd.colocarDisco();
        dvd.escolherIdioma();
        dvd.apertarPlay();
    }
    
}
