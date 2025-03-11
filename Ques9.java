
//Maximum 

import java.util.Scanner;
public class Ques9{
    public static void main(String args[]){
        int arr[]=new int []{9,3,1,4,13,5,6};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}