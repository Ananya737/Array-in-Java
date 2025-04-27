
import java.util.Scanner;

//Count how many even and odd numbers are there in the array:

public class Chatgpt {
   

    public static void odd(int arr[]){
        int evenCnt=0;
        int oddCnt=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCnt++;
            }else{
                oddCnt++;
            }
        }

        System.out.println("Even numbers:" + evenCnt);
        System.out.println("Odd numbers:" + oddCnt);

       
    }
    

    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int size;
        System.out.println("Enter size:");
        size=obj.nextInt();

        System.out.println("Enter elements of array:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();         
        }

        odd(arr);


        
      
        

    }
    
}
