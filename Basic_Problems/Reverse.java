package Basic_Problems;

public class Reverse {
    public static void main(String[] args) {
        int n=123;
        int digit=0;
        while (n != 0) {
            int rem =  n%10;
            digit =digit*10+rem;
            n=n/10;
        }
        System.out.println(digit);
    }
}
