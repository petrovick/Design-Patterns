package Composite;
public class ProdutoComposto implements Produto
{
    private Produto p1;
    private Produto p2;
    
    public ProdutoComposto(Produto p1, Produto p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String getDescricao() {
        return p1.getDescricao() + " " + p2.getDescricao();
    }

    @Override
    public float getPreco() {
        return p1.getPreco() + p2.getPreco();
    }
    
    
}
