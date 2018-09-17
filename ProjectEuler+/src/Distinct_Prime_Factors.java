import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Distinct_Prime_Factors {

    public static void main(String[] args) throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        String in[] = ob.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int k = Integer.parseInt(in[1]);

        int a[] = new int[n+k];
        a[1]=1;
        int nc =0;
        for(int i=2;i<a.length;i++){
            if(a[i] == 0){
                int b = i;
                while(b < a.length){
                    a[b]+=1;
                    b+=i;
                }
                nc = 0;
            }
            else if(a[i]==k){
                nc++;
            }
            else{
                nc=0;
            }
            if(nc == k){
                System.out.println(i-k+1);
                nc = (nc-1<0)?0:(nc-1);
            }
        }
    }
}
