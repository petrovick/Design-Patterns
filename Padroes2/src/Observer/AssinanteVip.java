/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author root
 */
public class AssinanteVip implements Observer
{
    @Override
    public void notificar(String nome, float valor) {
        System.out.println("Extravip: Nome " + nome + " valor " + valor);
    }
}
