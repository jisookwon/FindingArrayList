package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            numbers.add(i + 1);
        }

        Collections.shuffle(numbers);

        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //int answer = keyboard.nextInt();
        System.out.println("Enter a number : ");
        int answer = keyboard.nextInt();
        //while (!iterator.next().equals(answer))
        for (int i=0;i<numbers.size();i++){
               if (numbers.get(i) == answer) {
                   System.out.println("I found number "+numbers.get(i)+ "index is " + (i+1));
               }else {
               }
        }
    }
}