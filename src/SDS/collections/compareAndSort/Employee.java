/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.compareAndSort;

import java.util.Date;

/**
 *
 * @author Hung
 */
public class Employee {
    String firstName;
    String lastName;
    Date joinDate;
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString() {
        return firstName + " " + lastName;
    }
    // getters and setters
}
