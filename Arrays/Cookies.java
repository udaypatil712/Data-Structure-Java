package Arrays_Java.Arrays;


public class Cookies {
    public static void main(String[] args) {
        int[] g={1,2};
        int[] s={1,2,3};

        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(g[i] <= s[j] && i == j){
                    System.out.println(s[j]);
                }
            }
        }
    }
}
