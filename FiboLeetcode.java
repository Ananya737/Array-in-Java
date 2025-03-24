public class FiboLeetcode{
    public static void main(String args[]){
        int n=5;
          int first=0;
        int sec=1;
        int next=0;
        for(int i=0;i<n;i++){
            
            next=first+sec;
            first=sec;
            sec=next;      
        }
        System.out.println(first);
    }
}