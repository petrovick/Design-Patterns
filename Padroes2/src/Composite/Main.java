package Composite;
public class Main
{
    public static void main(String... args)    
    {
        Produto p1 = new ProdutoUnico("Arroz", 10.0f);
        Produto p2 = new ProdutoUnico("Feijão", 20.0f);
        Produto p3 = new ProdutoUnico("Oleo", 50f);
        Produto kitDoacao = new ProdutoComposto(p1, p2);
        System.out.println("KitDoacao: " + kitDoacao.getDesricao());
        
        Produto kitUltraDoacao = new ProdutoComposto(p2, p3);
        System.out.println("kitUltraDoacao: " + kitUltraDoacao.getDesricao());
        
        Produto SuperUltraKitDoacao = new ProdutoComposto(kitDoacao, kitUltraDoacao);
        System.out.println("SuperUltraKitDoacao: " + SuperUltraKitDoacao.getDesricao());
        
        Produto SuperUltraMegaPlusAdvancedRevolucionalKitDoacao = new ProdutoComposto(SuperUltraKitDoacao, kitUltraDoacao);
        System.out.println("SuperUltraMegaPlusAdvancedRevolucionalKitDoacao: " + SuperUltraMegaPlusAdvancedRevolucionalKitDoacao.getDesricao());
        
        
    }
}
