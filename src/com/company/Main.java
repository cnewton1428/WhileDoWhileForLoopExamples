package com.company;

public class Main {

    public static void main(String[] args) {
	// While loop keeps looping until it finds one thing to read

        int i=0;
//        while (i<= 3) {
//            System.out.println(i);
//            i++;
//        }
//
        //decision making doing it multiple times
        do {
            System.out.println(i);
            i++;
        }
        while (i<=10);

        for (int i=0; i<= 10; i++) {
            System.out.println("Current i: " + i);
        }
    }
}
