package com.collectionTwo.test4OrForeTreeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TestForeTreeSetApplication {
    public static void main(String[] args) {

        Student studentOne = new Student(100, "Armin", "Aliani");
        Student studentTwo = new Student(250, "Arian", "Aliani");
        Student studentThree = new Student(120, "Reza", "Aliani");
        Student studentFore = new Student(14, "Mahdi", "Aliani");

        TreeSet<Student> treeSetOne = new TreeSet<>();
        treeSetOne.add(studentOne);
        treeSetOne.add(studentTwo);
        treeSetOne.add(studentThree);
        treeSetOne.add(studentFore);

        System.out.println(treeSetOne);

        System.out.println();

        List<Student> studentList = new ArrayList<>();
        studentList.add(studentOne);
        studentList.add(studentTwo);
        studentList.add(studentThree);
        studentList.add(studentFore);

        System.out.println("Before sorting : " + studentList);

        Collections.sort(studentList);

        System.out.println();

        System.out.println("After sorting : " + studentList);

    }
}
