package Basic_Problems;

public class Demo {
    public static void main(String[] args) {
        int n = 60;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                count++;
            }
        }
        System.out.println(count);
    }

}
