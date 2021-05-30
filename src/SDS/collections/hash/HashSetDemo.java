/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.hash;

import java.util.HashSet;

/**
 *
 * @author Hung
 */
public class HashSetDemo {
    public static void main(String[] args) {
         //Creating One HashSet object 
        HashSet<String> set = new HashSet<String>(); 
        //Adding elements to HashSet 
        set.add("RED"); 
        set.add("GREEN"); 
        set.add("BLUE"); 
        set.add("PINK"); 
        //Removing "RED" from HashSet 
        set.remove("RED");
    }
}
