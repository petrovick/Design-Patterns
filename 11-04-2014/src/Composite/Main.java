package Composite;
public class Main
{
    public static void main(String ... args)
    {
        Produto p1 = new ProdutoUnico("Arroz", 10f);
        Produto p2 = new ProdutoUnico("Feijao", 8f);
        Produto p3 = new ProdutoUnico("Oleo", 2f);
        Produto p4 = new ProdutoUnico("Leite", 3f);
        
        Produto kit = new ProdutoComposto(p1, p2);
        System.out.println("Kit:" + kit.getDescricao() + " Valor:" + kit.getPreco());
        Produto KitAbelha = new ProdutoComposto(p3, kit);
        System.out.println("KitAbelha:" + KitAbelha.getDescricao() + " Valor:" + KitAbelha.getPreco());
        
        
        Produto KitJanta = new ProdutoComposto(KitAbelha, p4);
        System.out.println("KitAbelha:" + KitJanta.getDescricao() + " Valor:" + KitJanta.getPreco());
        
    }
    
}
