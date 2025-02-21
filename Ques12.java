
//Sorting:Decending

import java.util.Scanner;
public class Ques12{
    public static void main(String args[]){

        int arr[]= new int[]{2,4,3,1,5};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
           
        }

        for(int i:arr){
         System.out.print(i+" ");
        }
    }
}