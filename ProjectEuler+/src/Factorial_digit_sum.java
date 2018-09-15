import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial_digit_sum {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t,n,c=1,sum=0,i;
        String x;
        BigInteger a=new BigInteger("1");
        BigInteger b;
        t=Integer.parseInt(ob.readLine());
        while(c<=t)
        {
            n=Integer.parseInt(ob.readLine());
            for(i=1;i<=n;i++)
            {
                b=new BigInteger(String.valueOf(i));
                a=a.multiply(b);
            }
            x=a.toString();
            for(i=0;i<x.length();i++)
                sum=sum+(x.charAt(i)-'0');
            System.out.println(sum);
            c++;
            sum=0;
            a=new BigInteger("1");
        }
    }
}
