package com.company;

public class Main {

    public static void main(String[] args) {

        int arr[] = {1,2,5,5,2,7};

        RecSolution recSolution = new RecSolution();

        System.out.println(recSolution.isSimm(arr,0,arr.length-1));


    }
}
