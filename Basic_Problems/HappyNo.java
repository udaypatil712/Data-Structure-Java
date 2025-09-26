package Basic_Problems;

public class HappyNo {
    public static void main(String[] args) {
        int n= 19;
        int d=0;
        int temp=0;
 
            while (n>0) {
                int r=n%10;
                d=d+(r*r);
                n=n/10;
                
            }
             System.out.println(d);
 
    
    }
}
