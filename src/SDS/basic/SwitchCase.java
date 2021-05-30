/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import javax.swing.JOptionPane;

/**
 *
 * @author Hung
 */
public class SwitchCase {
    public static void main(String[] args) {
        char c;
        String str = JOptionPane.showInputDialog(null, "Nhap vao ky tu?");
        c = str.charAt(0);
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Ky tu nay la nguyen am");
                break;
            default:
                System.out.println("Ky tu nay la phu am");
        }
        System.exit(0); // kết thúc chương trình
    }
}
