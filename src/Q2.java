import java.text.DecimalFormat;
import java.text.Format;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author silent 1183611386@qq.com
 * @date 2019/4/9 20:03
 */
public class Q2 {
    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] water = new int[2*n];
        for(int i =0;i<2*n;i++){
            water[i] = scanner.nextInt();
        }
        Arrays.sort(water);
        double sum;

        if(water[0]*2<=water[n]){
            // 以女生最小的杯子为基准
            sum = 3*n*water[0];
        }else{
            // 以男生最小的杯子为基准
            sum = (water[n]/2.0)*3*n;
        }
        DecimalFormat format = new DecimalFormat("#0.000000");
        sum =sum>w?w:sum;
        System.out.println(format.format(sum));
    }
}
