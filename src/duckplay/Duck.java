/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duckplay;

import com.interfacelist.QuackBehavior;
import com.interfacelist.FlyBehavior;

/**
 *
 * @author wasir
 */
public abstract class Duck {
    String wasir;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
       System.out.print("All ducks float. even decoys");
    }
}
