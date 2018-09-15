import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Largest_prime_factor {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(ob.readLine());
        int c=0,x=3,d;
        long a;
        while(c<t)
        {
            a=Long.parseLong(ob.readLine());
            while(a%2==0)
            {
                a=a/2;
            }
            d=(int)Math.sqrt(a);
            while((x<=d)&&(a!=1))
            {
                while(a%x==0)
                {
                    a=a/x;
                }
                x+=2;
            }
            if(a==1)
                System.out.println(x-2);
            else
                System.out.println(a);
            x=3;c++;
        }
    }
}
