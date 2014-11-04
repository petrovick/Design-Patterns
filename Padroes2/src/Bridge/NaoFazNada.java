/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author root
 */
public class NaoFazNada implements PosProcessar
{

    @Override
    public void PorProcessar() {
        System.out.println("Não faz nada.");
    }
    
}
