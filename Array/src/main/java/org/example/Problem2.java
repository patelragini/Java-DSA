package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

//Write a Java program to convert an array to ArrayList
public class Problem2 {
    String[][] array= new String[][]{{"java","golang"},{"python","ruby","kotlin"}};
    ArrayList arrayList = new ArrayList<>();
    public void ArrayList(){
        for (int i=0;i<array.length; i++){
            for (int j=0;j< array[i].length;j++){
               arrayList.add(array[i][j]);
            }
        }
    }
    //print array in matrix format
    public void PrintArray(){
        for (int i=0;i<array.length; i++){
            for (int j=0;j< array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
//3. Write a Java program to find all pairs of elements in an
//    array whose sum is equal to a specified number.

    int[] numbers= new int[]{2,5,7,1,4,9,10,3,7,5,15,19,17,20};
    int sum =0;
    public void SpecificSum(){
        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers.length-i;j++){
               sum = numbers[i]+numbers[j];
               if (sum ==20){
                   System.out.print("("+numbers[i]+","+numbers[j]+")");
               }
            }
        }
    }
}



