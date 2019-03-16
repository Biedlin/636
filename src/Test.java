import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by wzp on 2019/3/16.
 */
public class Test {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[][] a = new int[n][2];
        int tmp[] = new int[n];
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            tmp[i] = a[i][1];
            map.put(a[i][1],a[i][0] );
        }

        Arrays.sort(tmp);
        for (int i = n - 1;i > 1 ;i--) {
            for (int j = i - 1;j >= 0;j--) {
                if (Math.abs(map.get(tmp[i]) - map.get(tmp[j])) > b)
                    System.out.println(tmp[i] + " " + tmp[j] + " " + Math.abs(map.get(tmp[i]) - map.get(tmp[j])));
            }

        }

    }
}
