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
public class ClassImplDefaultMethod implements interfaceDefaultMethod1, interfaceDefaultMethod2 {

     

    @Override
    public void firstMethod(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void secondMethod() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void log(String string){
        System.out.println("MyClass logging::" + string);
    }

    @Override
    public void a() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}