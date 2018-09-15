import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maximum_path_sum_I {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(ob.readLine());
        while(x>0){
            int n=Integer.parseInt(ob.readLine());
            int a[][] = new int[n+1][n+1];
            int t[][] = new int[n+1][n+1];
            int i,j;
            for(i=1;i<=n;i++){
                for(j=1;j<=i;j++){
                    a[i][j] = Integer.parseInt(ob.readLine());
                }
            }

            for(i=1;i<=n;i++){
                for(j=1;j<=i;j++){
                    t[i][j]=Math.max(t[i-1][j],t[i-1][j-1])+a[i][j];
                }
            }
            int res=0;
            for(i=1;i<=n;i++){
                res=Math.max(res,t[n][i]);
            }
            System.out.println(res);
            x--;
        }
    }
}
