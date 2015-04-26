/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duckplay;

/**
 *
 * @author wasir
 */
public class DuckPlay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Duck mallarDuck = new MallardDuck();
       mallarDuck.performQuack();
       mallarDuck.performFly();
       mallarDuck.display();
    }
}
