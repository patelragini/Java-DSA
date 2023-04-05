package org.example;

public class Factorial {
    public int Factorial(int k){
        if(k>0){
            return k * Factorial(k-1);
        }
        else {
            return 1;
        }
    }

}
