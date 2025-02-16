import java.util.Scanner;
public class Ques1{
public static void main(String agrs[]){
Scanner obj= new Scanner (System.in);

int size;
System.out.println("Enter size of an array:");
size=obj.nextInt();
 int arr[];
 arr=new int[size];

for(int i=0;i<arr.length;i++){
    arr[i]=obj.nextInt();
    
}




for(int i=0;i<arr.length;i++){
   
    System.out.println(arr[i]);
}















    }
}