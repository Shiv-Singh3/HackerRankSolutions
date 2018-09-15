import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Truncatable_primes {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n,i,sum=0,a,c,b,f,j,d,x;
            n=Integer.parseInt(ob.readLine());
        for(i=23;i<n;i=i+2)
        {
            a=i;f=0;
            x=10;c=0;
            while(a!=0)
            {
                c++;
                a=a/10;
            }
            a=i;d=(int)(Math.pow(10,c));
            while(x<=d)
            {
                b=a%x;
                if(b==1)
                {
                    f=1;
                    break;
                }
                for(j=2;j<=(int)Math.sqrt(b);j++)
                {
                    if(b%j==0)
                    {
                        f=1;
                        break;
                    }
                }
                if(f==1)
                    break;
                x=x*10;
            }
            if (f != 1) {
                a=i;f=0;
                d=(int)(Math.pow(10,c-1));
                while(d!=0)
                {
                    b=a/d;
                    if(b==1)
                    {
                        f=1;
                        break;
                    }
                    for(j=2;j<=(int)Math.sqrt(b);j++)
                    {
                        if(b%j==0)
                        {
                            f=1;
                            break;
                        }
                    }
                    if(f==1)
                        break;
                    d=d/10;
                }
                if(f==0)
                {
                    sum+=i;
                }
            }
        }
        System.out.println(sum);
    }
}
