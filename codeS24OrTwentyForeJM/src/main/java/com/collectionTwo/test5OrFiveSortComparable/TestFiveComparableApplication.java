package com.collectionTwo.test5OrFiveSortComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TestFiveComparableApplication {
    public static void main(String[] args) {

        Ball ballOne = new Ball(1);
        Ball ballTwo = new Ball(6);
        Ball ballThree = new Ball(4);
        Ball ballFore = new Ball(2);
        Ball ballFive = new Ball(10);

        TreeSet<Ball> treeSetOne = new TreeSet<>();
        treeSetOne.add(ballOne);
        treeSetOne.add(ballTwo);
        treeSetOne.add(ballThree);
        treeSetOne.add(ballFore);
        treeSetOne.add(ballFive);

        System.out.println(treeSetOne);

        System.out.println();

        List<Ball> ballList = new ArrayList<>();
        ballList.add(ballOne);
        ballList.add(ballTwo);
        ballList.add(ballThree);
        ballList.add(ballFore);
        ballList.add(ballFive);

        System.out.println("Before sorting : " + ballList);

        Collections.sort(ballList);

        System.out.println();

        System.out.println("After sorting : " + ballList);

    }
}
