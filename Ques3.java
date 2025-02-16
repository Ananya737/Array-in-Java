
//Reversing an array

import java.util.Scanner;
public class Ques3{
public static void main(String agrs[]){
Scanner obj= new Scanner (System.in);


 int arr[];
 arr=new int[]{1,2,3,4,5,6};
int start=0;
int end=arr.length-1;

while(start<end){
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;

    start++;
    end--;

}




for(int i:arr){
   
    System.out.print(i+ " ");
}















    }
}