package Template;
public abstract class Pizza
{
    private void massa()
    {
        System.out.println("Massa feita");
    }
    protected abstract void recheio();
    private void assar()
    {
        System.out.println("Assando pizza.");
    }
    public void preparar()
    {
        massa();
        recheio();
        assar();
    }
}