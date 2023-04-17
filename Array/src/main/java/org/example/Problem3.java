package org.example;
// Write a Java program to find the second largest element in an array.
public class Problem3 {
    int [] array = new int[] {5,3,7,1,9,34,76,2,87,45,23,65,12,9};
    public void SecondLargest(){
        int max=0;
        for (int i=0;i< array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        int secondMax = 0;
        for (int i=0;i< array.length;i++){
            if (array[i]<max && array[i] > secondMax){
                secondMax = array[i];
            }
        }
        System.out.println("maximum number is "+secondMax);
    }
}
