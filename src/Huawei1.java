import java.util.Scanner;

/**
 * @author silent 1183611386@qq.com
 * @date 2019/4/10 19:13
 */
public class Huawei1 {
    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] c= s.toCharArray();
        String ans =getAns(c,0,c.length-1);
        System.out.println(revert(ans));
    }

    private static String revert(String s) {
        int i =0;
        int j=s.length()-1;
        char[] ch = s.toCharArray();
        while(i<j){
            char c =ch[i];
            ch[i] =ch[j];
            ch[j] =c;
            i++;
            j--;
        }
        return String.valueOf(ch);
    }

    private static String getAns(char[] c, int s, int e) {
        StringBuilder sb = new StringBuilder();
        int time =0;
        while(s<=e){
            if(c[s]>='0' && c[s]<='9'){
                time =time *10+ c[s]-'0';
                s++;
            }else if(c[s]=='(' || c[s]=='{'|| c[s]=='[' ){
                // 找右括号
                int j=s+1;
                int appeare =1;
                while(appeare!=0){
                    if(c[j]=='(' || c[j]=='{'|| c[j]=='['){
                        appeare++;
                    }else if (c[j]==')' || c[j]=='}'|| c[j]==']'){
                        appeare--;
                    }
                    j++;
                }
                String sub = getAns(c,s+1,j-2);
                while(time>0){
                    sb.append(sub);
                    time--;
                }
                s= j;
            }else{
                sb.append(c[s]);
                s++;
            }
        }
        return sb.toString();
    }
}
