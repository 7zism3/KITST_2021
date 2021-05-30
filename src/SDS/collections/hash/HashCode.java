/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.hash;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hung
 */
// Driver code
public class HashCode {

    static class Employee {

        String name;
        int id;

        Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public int hashCode() {

        // We are returning the Employee_id 
            // as a hashcode value.
            // we can also return some 
            // other calculated value or may
            // be memory address of the 
            // Object on which it is invoked. 
            // it depends on how you implement 
            // hashCode() method.
            return this.id;
        }

    }

    public static void main(String[] args) {

        // creating two Objects with 
        // same state
        Employee g1 = new Employee("aditya", 1);
        Employee g2 = new Employee("aditya", 1);

        Map<Employee, String> map = new HashMap<Employee, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");

        for (Employee geek : map.keySet()) {
            System.out.println(map.get(geek).toString());
        }

    }
}
 
