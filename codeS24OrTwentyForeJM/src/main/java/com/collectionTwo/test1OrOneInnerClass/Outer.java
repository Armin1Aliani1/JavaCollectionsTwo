package com.collectionTwo.test1OrOneInnerClass;

public class Outer {

    private int number = 200;

    public void display() {
        System.out.println("Inside Outer class # display()");
        Inner innerObject = new Inner();
        innerObject.print();
    }

    class Inner {
        private void print() {
            System.out.println("Inside Inner class # print()");
            System.out.println("This is number in Outer class but we call in inner class : " + number);
        }
    } // End of Inner class

} // End of Outer class
