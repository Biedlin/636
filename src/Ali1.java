/**
 * @author silent 1183611386@qq.com
 * @date 2019/4/12 20:22
 */
public class Ali1 {
    public int getAns(int m,int n,int k){
        return getAns(m,n,k,1,1);
    }

    private int getAns(int m, int n, int k, int i, int j) {

        if(m<i && n <j){
            return 0;
        }
        if(k<0){
            return 0;
        }
        if(m==0&&n==0){
            return 1;
        }
        int res =0;
        for(int x=i;x<=m;x++){
            res+=getAns(m-x,n,k-1,x,j);
        }
        for(int y=j;y<=n;y++){
            res+=getAns(m,n-y,k-1,i,y);
        }
        return res;
    }
    public static void main(String...args){
        Ali1 ali1= new Ali1();
        System.out.println(ali1.getAns(1,1,3));
    }
}
