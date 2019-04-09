import java.text.DecimalFormat;
import java.util.*;
public class Main {
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

        if(water[0]<=(water[n]>>1)){
            // 以女生最小的杯子为基准
            if(water[0]> w/n){
                sum = w;
            }else{
                sum = 3*n*water[0];
            }

        }else{
            // 以男生最小的杯子为基准
            if(water[n]/2.0 > w/n){
                sum = w;
            }else{
                sum = (water[n]/2.0)*3*n;
            }
        }
        DecimalFormat format = new DecimalFormat("#0.000000");
        sum =sum>w?w:sum;
        System.out.println(format.format(sum));
    }
}
