import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Lattice_paths {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(ob.readLine()),x=0;
        BigInteger f=new BigInteger("10");
        BigInteger g=f.pow(9);
        g=g.add(new BigInteger("7"));
        while(x<t)
        {
            int n=Integer.parseInt(ob.readLine()),m=Integer.parseInt(ob.readLine());
            BigInteger a=fact(m+n);
            BigInteger b=fact(m);
            BigInteger c=fact(n);
            BigInteger d=b.multiply(c);
            BigInteger e[]=a.divideAndRemainder(d);
            BigInteger h[]=e[0].divideAndRemainder(g);
            System.out.println(h[1]);
            x++;
        }
    }

    private static BigInteger fact(int a)
    {
        String b=String.valueOf(a);
        BigInteger c=new BigInteger(b);
        BigInteger i=new BigInteger("1");
        BigInteger d=new BigInteger("1");
        while(c.compareTo(i)>=0)
        {
            d=d.multiply(i);
            i=i.add(new BigInteger("1"));
        }
        return d;
    }
}
