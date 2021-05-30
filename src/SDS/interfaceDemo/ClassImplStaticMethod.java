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
public class ClassImplStaticMethod 
implements interfaceDemoStaticMethod1{
   // 1. không thể cài đặt phương thức static của interfaceDemoStaticMethod1
   
// Đây là phương thức riêng của ClassImplStaticMethod
    
    static void printStr(String st){
        interfaceDemoStaticMethod1.printStr(st);
    }

    public static void main(String args[]){
           ClassImplStaticMethod.printStr("sâsa");
    }
}
