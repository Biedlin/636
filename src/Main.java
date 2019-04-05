import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] w = new long[n];
        int[] money = new int[n];
        for(int i =0;i<n;i++){
            w[i]= scanner.nextLong();
        }
        for(int i =0;i<n;i++){
            money[i]= scanner.nextInt();
        }

        int[] dp = new int[n];
        dp[0] = money[0];
        int wuli =w[0];
        for(int i =1;i<n;i++){
            if(w[i]<wuli){
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1] + money[i];
                wuli+=w[i];
            }
        }
        System.out.println(dp[n-1]);
    }
}
