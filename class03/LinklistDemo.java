package com.example3.Collection;

import java.util.LinkedList;

public class LinklistDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("F");
        list.add("G");
        list.add("H");

        list.addLast("Z");
        list.add(1, "A2");
        list.addFirst("A1");

        System.out.println("Original content of list: " + list);

        list.remove("B");//theo ten

        list.remove(2); //theo vi tri

        System.out.println("COntent of list after deletion " + list);

        Object list1 = list.get(3);//lay phan tu co chi so 3

        // Thiet lap vi tri cua pt co chi so 3
        list.set(2, (String) list1 + "updated");

        System.out.println("List after update: " + list);


    }
}