import java.util.Scanner;

/**
 * @author silent 1183611386@qq.com
 * @date 2019/4/9 19:38
 */
public class Q1 {
    public static void main(String...args){
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();


        if(n<6){
            System.out.println(0);
            return;
        }
        if(n==6){
            System.out.println(1);
            return;
        }
        long[] res = new long[n+1];
        for(int i=0;i<=n;i++){
            res[i] =-1;
        }
        long ans =0;
        int c =6;
        while (n >= c) {
            ans +=getAns(n-c,res);
            ans = ans % 666666666;
            c++;
        }
        System.out.println(ans);
    }

    private static long getAns(int n, long[] res) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(res[n]!=-1){
            return res[n];
        }
        long ans =0;
        int c =1;
        while(n>=c){
            ans += getAns(n-c,res);
            ans %=666666666;
            c++;
        }
        res[n] = ans;
        return ans ;
    }
}
