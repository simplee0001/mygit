package com.sw.sufa;

public class BubArray {
     private long[] arr;
     private int elements;
     //
    //默认的构造
    public BubArray() {
        arr = new long[30];
    }
    public BubArray(int max){
        arr = new long[max];

    }
    public void insert(int value){
        arr[elements] = value;
        elements++;
    }
    public void display(){
        for(int i = 0 ;i<elements;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void bubbelSort(){
        long temp = 0L;
        for(int i = 0;i<elements-1;i++){
            for(int j = 0;j<elements-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
