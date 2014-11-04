/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author root
 */
public abstract class Humano
{
    private JeitoDeComer jeitoDeComer;

    public Humano(JeitoDeComer jeitoDeComer)
    {
        this.jeitoDeComer = jeitoDeComer;
    }
    
    public JeitoDeComer getJeitoDeComer() {
        return jeitoDeComer;
    }

    public void setJeitoDeComer(JeitoDeComer jeitoDeComer) {
        this.jeitoDeComer = jeitoDeComer;
    }
}
