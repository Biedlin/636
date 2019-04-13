
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String...args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int m = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < m; i++) {
            set.add(br.readLine());
        }
        String T = br.readLine();
        int result = 0;
        int len = T.length();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if(set.contains(T.substring(i, j))){
                    result++;
                    i = j;
                    j = i;
                }
            }
        }
        System.out.println(result);
    }
}
