import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res =0;
        while(num!=0){
            if((num&1)==1){
                res++;
            }
            num=num>>1;
        }
        System.out.println(res);
    }

}
