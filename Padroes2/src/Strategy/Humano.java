package Strategy;
public abstract class Humano
{
    private JeitoDeComer jeitoDeComer;

    public Humano(JeitoDeComer jeitoDeComer)
    {
        this.jeitoDeComer = jeitoDeComer;
    }
    
    public JeitoDeComer getJeitoDeComer() {
        return jeitoDeComer;
    }

    public void setJeitoDeComer(JeitoDeComer jeitoDeComer) {
        this.jeitoDeComer = jeitoDeComer;
    }
}
