package aamir;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter all three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


        //Q> Find the largest of three numbers
        int max = a;
        if (b > a){
           max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max + " is the largest number of three. ");
    }
}

// Using if else.

// int max = 0;
// if (a > b){
//     max = a;
//         } else {
//     max = b;
//         }
// if (c > max) {
//     max = c;
//         }


// Using Math.max (Math is a class and math is a function)
//int max = Math.max(c, Math.max(a, b));
//System.out.println(max);
