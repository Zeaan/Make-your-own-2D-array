package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of array");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns of array");
        int columns = sc.nextInt();
        int[][] array = new int[rows][columns];
        int number;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.println("Enter number for column");
                number = sc.nextInt();
                array[i][j] = number;
            }
            System.out.println("New Row starts");
        }
        System.out.println(Arrays.deepToString(array));
    }
}
