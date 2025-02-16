
//Palindrome

import java.util.Scanner;
public class Ques4{
public static void main(String agrs[]){
Scanner obj= new Scanner (System.in);


 int arr[];
 arr=new int[]{1,2,3,2,1};


int start=0;
int end=arr.length-1;

while(start<end){
    if(arr[start]!=arr[end]){
    System.out.println("Not");
    return;
    }
    
    start++;
    end--;
}


System.out.println("Palindrome");
















    }
}