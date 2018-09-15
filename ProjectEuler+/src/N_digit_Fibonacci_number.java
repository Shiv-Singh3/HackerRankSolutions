import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class N_digit_Fibonacci_number {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n,q=0,y=2,i;
        BigInteger a=new BigInteger("8");
        BigInteger b=new BigInteger("13");
        BigInteger c=new BigInteger("13");
        BigInteger d;
        BigInteger e=new BigInteger("10");
        int t,x=7;
        int f[]=new int[5000];
        t=Integer.parseInt(ob.readLine());
        while(y<=5000)
        {
            d=e.pow(y-1);
            while(c.compareTo(d)<=0)
            {
                c=a.add(b);
                a=b;
                b=c;
                x++;
            }
            f[q++]=x;
            y++;
        }
        for(i=1;i<=t;i++)
        {
            n=Integer.parseInt(ob.readLine());
            System.out.println(f[n-2]);
        }
    }
}
