package com.collectionTwo.test7OrSevenHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestSevenHashMapApplication {
    public static void main(String[] args) {
        // Map : Key map to value
        Map<String, String> mapOne = new HashMap<>();
        mapOne.put("Armin", "Hello");
        mapOne.put("Arian", "Bye");
        mapOne.put("Reza", "Hi");

        System.out.println(mapOne.get("Armin"));
        System.out.println(mapOne.get("Arian"));
        System.out.println(mapOne.get("Ariannnnnn"));

        System.out.println();

        Student studentOne = new Student(100, "Armin", "Aliani");
        Student studentTwo = new Student(250, "Arian", "Aliani");
        Student studentThree = new Student(120, "Reza", "Aliani");
        Student studentFore = new Student(14, "Mahdi", "Aliani");
        Student studentFive = new Student(28, "Ali", "Aliani");

        Map<Integer, Student> mapTwo = new HashMap<>();
        mapTwo.put(studentOne.getId(), studentOne);
        mapTwo.put(studentTwo.getId(), studentTwo);
        mapTwo.put(studentThree.getId(), studentThree);
        mapTwo.put(studentFive.getId(), studentFive);

        System.out.println(mapTwo.get(120).getFirstName());

        mapTwo.put(14, studentFore);
        mapTwo.put(120, studentFore);

        System.out.println(mapTwo.get(120).getFirstName());

        System.out.println();
        mapTwo.put(90000, studentFore);
        System.out.println(mapTwo.get(90000).getFirstName());
        System.out.println();
        System.out.println(mapTwo.get(20000));

        System.out.println();
        mapTwo.put(90000, null);
        System.out.println(mapTwo.get(90000));

        System.out.println();
        if (mapTwo.containsKey(90000)) {
            System.out.println("Value exists");
        }

        System.out.println();
        if (mapTwo.containsValue(studentFive)) {
            System.out.println("This Value exists");
        } else {
            System.out.println("This Value not exists");
        }

        if (mapTwo.containsKey(20000)) {
            System.out.println();
            System.out.println(mapTwo.get(20000).getFirstName());
        }

        System.out.println();
        for (Map.Entry<Integer, Student> entry : mapTwo.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " , Value : " + entry.getValue());
        }
        /*System.out.println();
        Iterator<Map.Entry<Integer,Student>> myIterator = mapTwo.entrySet().iterator() ;
        while (myIterator.hasNext()){
            Map.Entry<Integer,Student> entry = myIterator.next();
            System.out.println("Key : "+entry.getKey()+" , Value : "+entry.getValue());
        }*/

    }
}
