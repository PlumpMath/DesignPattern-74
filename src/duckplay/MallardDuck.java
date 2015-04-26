/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duckplay;

/**
 *
 * @author wasir
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    
    @Override
    public void display() {
      System.out.print("Mallard Duck");
    }
    
}
