
//Missing multiple numbers in an array:


import java.util.Scanner;
public class Ques6{
public static void main(String agrs[]){
Scanner obj= new Scanner (System.in);


 int arr[];
 arr=new int[]{1,5,7,8,9,15};


for(int i=0;i<arr.length-1;i++){
    
        if(arr[i+1]-arr[i]>1){
            for(int j=arr[i]+1;j<arr[i+1];j++){
                System.out.println(j);

            }
        
    }
}





}
}