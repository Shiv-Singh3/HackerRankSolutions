import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Summation_of_primes {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t,n,c=1,i,j;
        t=Integer.parseInt(ob.readLine());
        if((t>=1)&&(t<=10000))
        {
            BigInteger y=new BigInteger("0");
            int a[]=new int[1000000];
            BigInteger sum[]=new BigInteger[1000000];
            a[0]=0;
            for(i=0;i<1000000;i++)
                sum[i]=new BigInteger("0");
            for(i=2;i<=1000000;i++)
                a[i-1]=i;
            for(i=2;i<=1000;i++)
            {
                for(j=i*i;j<1000000;j+=i)
                    a[j-1]=0;
            }
            for(i=0;i<1000000;i++)
            {

                y=y.add(new BigInteger(String.valueOf(a[i])));
                sum[i]=sum[i].add(y);
            }
            while(c<=t)
            {
                n=Integer.parseInt(ob.readLine());
                if((n>=1)&&(n<=1000000))
                {
                    System.out.println(sum[n-1]);
                }
                c++;
            }
        }
    }
}
