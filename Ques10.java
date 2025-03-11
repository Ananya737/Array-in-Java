
//Minimum

import java.util.Scanner;
public class Ques10{
    public static void main(String args[]){
        int arr[]=new int []{9,3,1,4,5,6};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}