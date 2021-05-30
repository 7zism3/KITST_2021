/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.StringTokenizer;

/**
 *
 * @author Hung
 */
public class stringTokenizer {

    public static void main(String[] args) {
        String s = "Java is cool.";
        StringTokenizer tkz = new StringTokenizer(s);
        StringTokenizer tkz1 = new StringTokenizer(s, "ac");
        StringTokenizer tkz2 = new StringTokenizer(s, "ac", true);
        System.out.println("Tong so token = " + tkz.countTokens());
        while (tkz.hasMoreTokens()) {
           System.out.println(tkz.nextToken());
        }
        
         System.out.println("Tong so token = " + tkz1.countTokens());
        while (tkz1.hasMoreTokens()) {
           System.out.println(tkz1.nextToken());
        }
         System.out.println("Tong so token = " + tkz2.countTokens());
        while (tkz2.hasMoreTokens()) {
           System.out.println(tkz2.nextToken());
        }
    }
}
