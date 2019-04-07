import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]= scanner.nextInt();
        }
        int ans =0;
        int idx =0;
        for(int i=0;i<n;){
            if(nums[i]>0){
                // 找到第一个小于0的
                for (;idx<n;){
                    if(nums[idx]<0){
                        boolean full = (-nums[idx])>= nums[i];
                        if(full){
                            ans+=nums[i]*Math.abs(idx-i);
                            nums[idx]+=nums[i];
                            nums[i] =0;
                        }else{
                            ans+= (-nums[idx]) *Math.abs(idx-i);
                            nums[i] += nums[idx];
                            nums[idx] =0;

                        }
                        break;
                    }else{
                        idx++;
                    }
                }
            }else{
                i++;
            }
        }
        System.out.println(ans);
    }
}
