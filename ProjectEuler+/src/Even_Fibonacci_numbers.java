import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Even_Fibonacci_numbers {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(ob.readLine());
        long n,c=1,sum=2,a,b,d;
        if((t>=1)&&(t<=100000))
        {
            while(c<=t)
            {
                a=1;
                b=2;
                d=0;
                n = Integer.parseInt(ob.readLine());
                if((n>=10)&&(n<=(4*(int)Math.pow(10,16))))
                {
                    while(d<=n)
                    {
                        d=a+b;
                        a=b;
                        b=d;
                        if((d%2==0)&&(d<=n))
                            sum+=d;
                    }
                    System.out.println(sum);
                    sum=2;
                }
                c++;
            }
        }
    }
}
