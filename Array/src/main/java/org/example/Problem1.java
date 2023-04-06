package org.example;
//Write a Java program to print the following grid. Go to the editor
//
//        Expected Output :
//
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
public class Problem1 {
    public void grid(){
        int [][]a= new int[10][10];
        for (int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.printf("%2d",a[i][j]);
            }
            System.out.println();
        }
    }
}
