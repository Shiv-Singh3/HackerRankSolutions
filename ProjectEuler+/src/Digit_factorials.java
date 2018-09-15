import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Digit_factorials {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n,t,i;
        String s;
        n=Integer.parseInt(ob.readLine());
        int a[]={1,1,2,6,24,120,720,5040,40320,362880};
        BigInteger d=new BigInteger("0");
        BigInteger sum=new BigInteger("0");
        BigInteger c;
        if((n>=10)&&(n<=100000))
        {
            for(i=10;i<=n;i++)
            {
                t=i;
                while(t!=0)
                {
                    c=new BigInteger(String.valueOf(a[t%10]));
                    d=d.add(c);
                    t=t/10;
                }
                c=new BigInteger(String.valueOf(i));
                BigInteger bi[]=d.divideAndRemainder(c);
                s=bi[1].toString();
                if(s.equals("0"))
                    sum=sum.add(c);
                d=new BigInteger("0");
            }
            System.out.println(sum);
        }
    }
}
