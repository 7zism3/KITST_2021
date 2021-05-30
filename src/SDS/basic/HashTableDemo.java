/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author Hung
 */
public class HashTableDemo { 
    private Item[] data;
    private int capacity;
    private int size;
    private static final Item AVAILABLE = new Item("Available", null);

    public HashTableDemo(int capacity) {
        this.capacity = capacity;
        data = new Item[capacity];
        for (int i = 0; i < data.length; i++) {
            data[i] = AVAILABLE;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public int hashThis(String key) {

        return key.hashCode() % capacity;
    }

    public Object get(String key) {
        int hash = hashThis(key);
//        while (data[hash] != AVAILABLE && data[hash].key() != key) { 
//            hash = (hash + 1) % capacity;
//        }

        return data[hash].element();
    }

    public void put(String key, Object element) {
        if (key != null) {
            size++;
            int hash = hashThis(key);
//            while (data[hash] != AVAILABLE && data[hash].key() != key) { 
//                hash = (hash + 1) % capacity;
//            } 
            data[hash] = new Item(key, element);
        }
    }

    public Object remove(String key) {
        // not important now.
        throw new UnsupportedOperationException("Can't remove");
    }

    public String toString() {

        String s = "<HashTable[";
        for (int i = 0; i < this.capacity; i++) {
            s += data[i].toString();
            if (i < this.capacity - 1) {

                s += ",";
            }
        }
        s += "]>";
        return s;
    }

    public static void main(String[] args) {
        HashTableDemo ht = new HashTableDemo(5);
        ht.put("1", "a");
        ht.put("2", "b");
        System.out.println(ht.toString());
        Object it=ht.get("1");
        System.out.println(it.toString());
    }

}
