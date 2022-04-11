package com.example3.Collection;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        MapEmployee.demoMap();
            Employee employee1 =new Employee(1, "Phuong Hang", "Hang@gmail.com", "1234567");
            Employee employee2 =new Employee(2, "Viet Duc", "Duc@gmail.com", "099918223");
            Employee employee3 =new Employee(3, "Thu Trang", "Trang@gmail.com", "039192922");
            Employee employee4 =new Employee(4, "Phu Trong", "Trong@gmail.com", "042991823");

        //Khoi tao map
        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        map.put(employee1.getId(),employee1);
        map.put(employee2.getId(),employee2);
        map.put(employee3.getId(),employee3);
        map.put(employee4.getId(), employee4);

        //Hien thi thong tin map su dung KeySet()
        for (Integer key: map.keySet()) {
            Employee value = map.get(key);
            System.out.println(key + " = "+ value);
        }

        System.out.println("======================================================");
        for (Map.Entry<Integer, Employee> entry: map.entrySet()) {
            Integer key = entry.getKey();
            Employee value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
