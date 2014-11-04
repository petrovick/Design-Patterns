package State;
public class Disponivel implements EstadoLivro
{

    @Override
    public boolean devolver(Livro livro) {
        System.out.println("Livro " + livro.getNome() + " já está devolvido.");
        return true;
    }

    @Override
    public void solicitar(Livro livro) {
        System.out.println("Emprestando livro " + livro.getNome());
        livro.estabelecerEstado(new Emprestado());
    }
    
}
