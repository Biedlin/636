import java.text.DecimalFormat;
import java.util.*;
class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int x){
        this.val=x;
    }

}
public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] str= input.split(",");
        if( str.length<=1 ){
            System.out.println("True");
            return;
        }
        int[] nums = new int[str.length];
        for(int i=0;i<str.length;i++){
            nums[i] = Integer.valueOf(str[i]);
        }
        boolean isBST = isBST(nums);
        System.out.println(isBST ? "True":"False");
    }

    private static boolean isBST(int[] nums) {
        return isBST(nums,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static boolean isBST(int[] nums, int i, int min, int max) {
        if(i>(nums.length/2)-1){
            return true;
        }
        if(nums[i]<=min || nums[i]>=max){
            return false;
        }
        return isBST(nums,i*2+1,min,nums[i])&&isBST(nums, i*2+2, nums[i], max);
    }


}
