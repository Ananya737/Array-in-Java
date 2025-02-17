
//Duplicate :


import java.util.Scanner;
public class Ques8{
public static void main(String agrs[]){
Scanner obj= new Scanner (System.in);


 int arr[];
 arr=new int[]{1,3,1,3,8,9,9,8,1,5,6,7};


for(int i=0;i<arr.length;i++){
    boolean dup=false;
    for (int j=i+1;j<arr.length;j++)
        
            if(arr[i]==arr[j]){
                arr[j]=-1;
                dup=true;
            }



            if(!dup && arr[i]!=-1){
                System.out.println(arr[i]);
            }



            
 
    }









}





    }


