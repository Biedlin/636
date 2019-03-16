/**
 * Created by wzp on 2019/3/16.
 */
import java.util.Scanner;
public class first {

    // 本题为考试多行输入输出规范示例，无需提交，不计分。



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int ans = 0;
            int tmp = 1024 - n;
            if (tmp == 0)
                ans = 0;
            else if (tmp < 4)
                ans = tmp;
            else if (tmp < 6)
                ans = 1 + tmp - 4;
            else if (tmp < 16)
                ans = tmp / 4 + tmp % 4;
            else if (tmp < 64)
                ans = tmp / 16 + (tmp % 16 / 4) + (tmp % 16 % 4);
            else
                ans = tmp / 64 + (tmp % 64 / 16) + (tmp % 64 % 16 / 4) + (tmp % 64 % 16 % 4);

            System.out.println(ans);
        }

}
