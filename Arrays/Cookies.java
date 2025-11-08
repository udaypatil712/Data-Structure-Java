package Arrays;

public class Cookies {
    public static void main(String[] args) {
        int[] g={1,2,3,4};
        int[] s={1,2,3};

        int count =0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(g[i] <= s[j] && i == j){
                    count++;
                    System.out.println(s[j]);
                }
            }
        }
        System.out.println(count);
    }
}
