package Bridge;
public class Main {
    public static void main(String... args)
    {
        Relatorio pdf = new RelatorioPDF();
        pdf.gerarRelatorio();
        
        pdf.setPosProcessar(new Crypt());
        pdf.gerarRelatorio();
    }
    
}
