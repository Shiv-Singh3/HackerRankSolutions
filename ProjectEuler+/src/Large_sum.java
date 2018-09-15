import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Large_sum {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n,c=0;
        n=Integer.parseInt(ob.readLine());
        if(n>=1&&n<=1000)
        {
            BigInteger sum=new BigInteger("0");
            String b="";
            BigInteger a[]=new BigInteger[n];
            while(c<n)
            {
                a[c]=new BigInteger(ob.readLine());
                sum=sum.add(a[c++]);
            }
            b=sum.toString();
            System.out.println(b.substring(0,10));
        }
    }
}
