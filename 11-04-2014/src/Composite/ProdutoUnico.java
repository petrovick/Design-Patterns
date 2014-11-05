package Composite;
public class ProdutoUnico implements Produto
{
    private String descricao;
    private float preco;
    
    public ProdutoUnico(String descricao, float valor)
    {
        this.descricao = descricao;
        this.preco = valor;
    }
            
    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public float getPreco() {
        return preco;
    }
}
