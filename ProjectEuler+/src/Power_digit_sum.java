import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Power_digit_sum {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int t,n,c=1,i;
        long sum=0;
        t=Integer.parseInt(ob.readLine());
        BigInteger a;
        BigInteger b=new BigInteger("2");
        while(c<=t)
        {
            n=Integer.parseInt(ob.readLine());
            a=b.pow(n);
            s=a.toString();
            for(i=0;i<s.length();i++)
                sum=sum+(s.charAt(i)-'0');
            System.out.println(sum);
            sum=0;
            c++;
        }
    }
}
