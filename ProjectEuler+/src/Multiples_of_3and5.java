import java.io.*;
import java.math.*;

public class Multiples_of_3and5 {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t,c=0,f=0;
        long n,c3,c5,c15;
        BigInteger sum=new BigInteger("0");
        BigInteger x;
        t=Integer.parseInt(ob.readLine());
        while(c<t)
        {
            n=Long.parseLong(ob.readLine());
            c5=n/5;
            c3=n/3;
            c15=n/15;
            if(n%15==0)
            {
                c15--;
                c3--;
                c5--;
                f=1;
            }
            if((f==0)&&(n%3==0))
                c3--;
            if((f==0)&&(n%5==0))
                c5--;
            x=new BigInteger(String.valueOf(((c3*(6+(c3-1)*3))>>1)+((c5*(10+(c5-1)*5))>>1)-((c15*(30+(c15-1)*15))>>1)));
            sum=sum.add(x);
            System.out.println(sum);
            c++;
            f=0;
            sum=new BigInteger("0");
        }
    }
}
