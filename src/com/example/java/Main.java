package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            This program is a solution for Hacker Rank problem Left Rotation Arrays.

            Given an array of n integers and a number ,d, perform d left rotations on the
            array. Then print the updated array as a single line of space-separated integers.

            The first line contains two space-separated integers denoting the respective values
            of (the number of integers) and (the number of left rotations you must perform).

            The second line contains space-separated integers describing the respective elements
            of the array's initial state.
         */
 /*     Sample Input
        5 4
        1 2 3 4 5

        Output: 5 1 2 3 4
*/
        //get input from console and define the variables
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];

        //get the integer values and store in array
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        //invoke the leftRotation method and pass as arguments the integer array and
        //the number of rotations.
        int[] result = leftRotation(a, d);

        //print out the results of the final rotation
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();


    }

    /*
        The leftRotation method will rotate the integer array per number of rotation value passed
        as a parameter d. Each rotation will have each element to shift one index location to
        the left of the array.
     */
    static int [] leftRotation(int [] a, int d){

        int temp;
        for (int i = 0; i < d ; i++) {
            temp = a[0];
            for (int j = 0; j < a.length -1; j++) {
                a[j] = a[j+1];

            }
            a[a.length-1] = temp;
        }

        return a;
    }
}
