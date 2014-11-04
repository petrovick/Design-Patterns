
package State;
public class Emprestado implements EstadoLivro
{

    @Override
    public boolean devolver(Livro livro)
    {
        System.out.println("Devolvendo livro " + livro.getNome());
        livro.estabelecerEstado(new Disponivel());
        return true;
    }

    @Override
    public void solicitar(Livro livro) {
        System.out.println("livro " + livro.getNome() + " já está emprestado.");
    }
    
}
