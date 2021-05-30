/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceDemo;

/**
 *
 * @author Hung
 */
public interface interfaceDefaultMethod1 {
    int x=10;
    void a();
    void firstMethod(String string);

    default void log(String string){
        System.out.println("This method is default implementation" + string);
    }
}
