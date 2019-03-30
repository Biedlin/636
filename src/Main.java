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
        String[] nums= input.split(",");
        if( nums.length<=1 ){
            System.out.println("True");
            return;
        }
        TreeNode root = new TreeNode(Integer.valueOf(nums[0]));
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        for(int i =1;i+1<nums.length;i=i+2){
            TreeNode now = queue.pop();
            TreeNode left = new TreeNode(Integer.valueOf(nums[i]));
            TreeNode right = new TreeNode(Integer.valueOf(nums[i+1]));
            now.left=left;
            now.right=right;
            queue.add(left);
            queue.add(right);
        }
        boolean isBST = isBST(root);
        System.out.println(isBST ? "True":"False");
    }

    private static boolean isBST(TreeNode root) {
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static boolean isBST(TreeNode root, int min, int max) {
        if(root==null){
            return true;
        }
        if(root.val<=min || root.val >=max){
            return false;
        }
        return isBST(root.left,min,root.val) && isBST(root.right,root.val,max);
    }
}
