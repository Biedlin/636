import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int m  = scan.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i]=scan.nextInt();
        }
        double[] seg = new double[n*m];
        double res =0;
        int idx =0;
        for(int i =n-1;i>=0;i--){
            for(int j=1;j<=m;j++){
                double segement = nums[i]/(j+0.00);
                DecimalFormat df = new DecimalFormat("#.00");
                segement = Double.parseDouble(df.format(segement));
                seg[idx] = segement;
                idx++;
            }
        }

        Arrays.sort(seg);
        for(int i=seg.length-1;i>=0;i--){
            int maxLen =0;
            for (int k=0;k<n;k++){
                maxLen += nums[k]/seg[i];
            }
            if(maxLen >=m){
                res = seg[i];
                break;
            }
        }
        System.out.println(String.format("%.2f",res));
    }

}
