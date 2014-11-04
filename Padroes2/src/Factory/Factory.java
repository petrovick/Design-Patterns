package Factory;

public class Factory
{
    public Carro fabricarCarro(String carro) throws Exception
    {
        if(carro.equalsIgnoreCase("palio"))
            return new Palio();
        else if(carro.equalsIgnoreCase("fiesta"))
            return new Fiesta();
        throw new Exception("Não existe o carro.");
    }
}
