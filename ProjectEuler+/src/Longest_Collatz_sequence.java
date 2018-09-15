import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Longest_Collatz_sequence {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        long t=Long.parseLong(ob.readLine()),n,c,d=1,c1=0,b=0,e=0,z=5*(int)(Math.pow(10,6));
        int i;
        long a[]=new long[(int)z];
        long f[]=new long[(int)z];
        for(i=1;i<=z;i++)
        {
            c=i;
            while(c!=1)
            {
                if((c<z)&&(a[(int)c-1]!=0))
                {
                    d=d+a[(int)c-1]-1;
                    break;
                }
                if(c%2==0)
                    c=c/2;
                else
                    c=(3*c)+1;
                d++;
            }
            if(d>=b)
            {
                a[i-1]=d;
                f[i-1]=i;
                b=d;e=i;
            }
            else
            {
                a[i-1]=d;
                f[i-1]=e;
            }
            d=1;
        }
        while(c1<t)
        {
            n=Long.parseLong(ob.readLine());
            System.out.println(f[(int)n-1]);
            c1++;
        }
    }
}
