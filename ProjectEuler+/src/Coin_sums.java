import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coin_sums {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        long count[] = new long[1000000];
        count[0]=1;
        int i,j;
        int p[] = {1,2,5,10,20,50,100,200};
        int m = 1000000007;
        for(i=0;i<8;i++){
            for(j=0;j<100000;j++){
                count[j+p[i]] = (count[j+p[i]]+count[j])%m;
            }
        }
        int t=Integer.parseInt(ob.readLine());
        while(t>0){
            int n=Integer.parseInt(ob.readLine());
            System.out.println(count[n]);
            t--;
        }
    }
}
