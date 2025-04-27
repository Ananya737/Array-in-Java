public class FiboLeetcode{
   
   public static int leet(int n){
      int first=0;
        int sec=1;
        int next=0;
        for(int i=0;i<n;i++){
            
            next=first+sec;
            first=sec;
            sec=next;      
        }
     return first;   

   }
   
    public static void main(String args[]){
    System.out.println(leet(2));
        
    }
}