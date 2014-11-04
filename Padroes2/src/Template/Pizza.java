/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template;

/**
 *
 * @author root
 */
public abstract class Pizza
{
    public void massa()
    {
        System.out.println("Massa feita");
    }
    public abstract void recheio();
    public void assar()
    {
        System.out.println("Assando pizza.");
    }
    public void preparar()
    {
        massa();
        recheio();
        assar();
    }
}