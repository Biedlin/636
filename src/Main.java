import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        Stack<Character> stack = new Stack<Character>();
        char[] c= s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(stack.isEmpty()){
                stack.push(c[i]);
            }else{
                if(stack.peek()!=c[i] ){
                    stack.pop();
                }else{
                    stack.push(c[i]);
                }
            }
        }
        System.out.println(stack.size());
    }
}
