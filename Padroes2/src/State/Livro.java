package State;
public class Livro
{
    private EstadoLivro estado;
    private String nome;
    
    public Livro(String nome)
    {
        this.nome = nome;
        estado = new Disponivel();
    }
    
    public void estabelecerEstado(EstadoLivro estado)
    {
        System.out.println("Transitando do estado " + this.estado.getClass() + " para o estado " + estado.getClass());
        this.estado = estado;
    }
    
    public void solicitar()
    {
        estado.solicitar(this);
    }
    
    public void devolver()
    {
        estado.devolver(this);
    }

    public EstadoLivro getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

