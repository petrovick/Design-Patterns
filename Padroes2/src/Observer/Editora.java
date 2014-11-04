package Observer;

import java.util.ArrayList;
import java.util.List;

public class Editora
{
    private List<Observer> observerList = new ArrayList<Observer>();
    private String nome;
    private float valor;
    
    public Editora(String nome, float valor)
    {
        this.nome = nome;
        this.valor = valor;
    }
    public void notificarTodos()
    {
        for(Observer o : observerList)
        {
            o.notificar(nome, valor);
        }
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void addObserverList(Observer o) {
        this.observerList.add(o);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
