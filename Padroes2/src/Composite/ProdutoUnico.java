package Composite;
public class ProdutoUnico implements Produto
{
    private String nome;
    private float preco;
    
    
    public ProdutoUnico(String nome, float preco)
    {
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getDesricao() {
        return nome;
    }
}
