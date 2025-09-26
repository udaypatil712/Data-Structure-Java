package Patterns;

public class O3_Mountain {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }



       n=3;

        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
