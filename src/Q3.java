import java.util.Arrays;
import java.util.Scanner;

/**
 * @author silent 1183611386@qq.com
 * @date 2019/4/7 20:52
 */
public class Q3 {
    public static void main(String...args){
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int k =scanner.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        Arrays.sort(nums);
        int minIdx =0;
        int plus =0;
        for(;minIdx<n;minIdx++){
            if(nums[minIdx]!=0){
                break;
            }
        }
        if(minIdx==n){
            System.out.println(0);
            return;
        }
        while(k-->0){
            if(minIdx==n){
                System.out.println(0);
                break;
            }
            System.out.println(nums[minIdx]-plus);
            plus = nums[minIdx];
            for(;minIdx<n;minIdx++){
                if(nums[minIdx]>plus){
                    break;
                }
            }
        }

    }
}
