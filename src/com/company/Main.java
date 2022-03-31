package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int i = 1;
        int first_num = rand.nextInt(1000) + 1;
        int max = first_num;
        int sum = 0;
        System.out.print(first_num + " ");
        while(i != 8){
            int rand_num = rand.nextInt(1000) + 1;
            System.out.print(rand_num + " ");
            if (rand_num > max) max = rand_num;
            sum += rand_num;
            i++;
        }
        System.out.println("\n" + max);
        System.out.println("summa = " + sum);




    }
}
