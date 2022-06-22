package com.collectionTwo.test5OrFiveSortComparable;

public class Ball implements Comparable<Ball> {
    private int weight;

    public Ball() {
    }

    public Ball(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Ball other) {
        if (this.weight < other.weight) {
            return -1;
        }
        if (this.weight == other.weight) {
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "weight=" + weight +
                '}';
    }
}
