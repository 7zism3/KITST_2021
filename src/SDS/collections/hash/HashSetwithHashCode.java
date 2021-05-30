/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.hash;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Hung
 */
public class HashSetwithHashCode {

    static class Human {

        private Integer age;
        private String name;

        Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return getName() + getAge().toString();
        }

        @Override
        public boolean equals(Object object) {
            Human human = (Human) object;
            if (human.getAge() == getAge() 
                    && human.getName().equals(getName())) {
            return true; 
            } 
            else  return false; 
        }

        @Override
        public int hashCode() {
            int value;
            value = getAge();// + getName().hashCode();
            return value;
            
        }

        /**
         * @return the age
         */
        public Integer getAge() {
            return age;
        }

        /**
         * @param age the age to set
         */
        public void setAge(Integer age) {
            this.age = age;
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Human human1 = new Human(21, "Sham");
        Human human2 = new Human(42, "Paul");
        Human human3 = new Human(18, "John");
        Set<Human> hashSet = new HashSet<Human>();
        hashSet.add(human1);
        hashSet.add(human2);
        hashSet.add(human3);
        // Below code creates a new object  of 'Paul'. 
        Human human4 = new Human(42, "Paul");
        hashSet.add(human4);
        for (Human h : hashSet) {
            System.out.println(h.toString());
        }
    }
}
