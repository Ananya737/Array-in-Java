
//Missing 1 number in an array:


import java.util.Scanner;
public class Ques5{
public static void main(String agrs[]){
Scanner obj= new Scanner (System.in);


 int arr[];
 arr=new int[]{1,3,5,7,8,9};


for(int i=0;i<arr.length;i++){
    
        if(arr[i+1]-arr[i]>1){
            System.out.println(arr[i]+1);
        
    }
}




















    }
}