/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author Rana Alie
 */
abstract class A1 {
    abstract void callme();
// concrete methods are still allowed in abstract classes
    void callmetoo() {
    System.out.println("This is a concrete method.");
    }
}
