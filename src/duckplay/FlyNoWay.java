/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duckplay;

import com.interfacelist.FlyBehavior;

/**
 *
 * @author wasir
 */
public class FlyNoWay implements  FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't fly :(");
    }
    
}
