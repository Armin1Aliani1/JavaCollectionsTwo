package com.collectionTwo.test3OrThreeTreeSet;

import java.util.TreeSet;

public class TestThreeTreeSetApplication {
    public static void main(String[] args) {

        // TreeSet : Used to sort information from small to large
        TreeSet<Integer> treeSetOne = new TreeSet<>();
        treeSetOne.add(10);
        treeSetOne.add(6);
        treeSetOne.add(40);
        treeSetOne.add(12);
        treeSetOne.add(4);
        treeSetOne.add(26);
        treeSetOne.add(86);
        System.out.println(treeSetOne);
        System.out.println("First : " + treeSetOne.first());
        System.out.println("Last : " + treeSetOne.last());
        System.out.println("Higher : " + treeSetOne.higher(8));
        System.out.println("Lower : " + treeSetOne.lower(16));
        System.out.println("Head set : " + treeSetOne.headSet(15));
        System.out.println("Tail set : " + treeSetOne.tailSet(12));
        System.out.println("Sub set : " + treeSetOne.subSet(4, 26));


        System.out.println();

        TreeSet<String> treeSetTwo = new TreeSet<>();
        treeSetTwo.add("a");
        treeSetTwo.add("c");
        treeSetTwo.add("b");
        treeSetTwo.add("g");
        treeSetTwo.add("f");
        System.out.println(treeSetTwo);
        // TreeSet : Used to sort information from small to large

    }
}
