import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangular_pentagonal_and_hexagonal {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        long a,b,n,h=1,p=1,x=2;
        n=Long.parseLong(ob.readLine());
        a=Long.parseLong(ob.readLine());
        b=Long.parseLong(ob.readLine());
        long c[]=new long[10000000];
        int z=1,i;
        double d;
        c[0]=1;
        if((a==3)&&(b==5))
        {
            while(p<n)
            {
                p=((3*x*x)-x)/2;
                d=(Math.sqrt(1+(8*p))-1)/2;
                if(((d-(int)d)==0)&&(p<n))
                    c[z++]=p;
                x++;
            }
            for(i=0;i<z;i++)
                System.out.println(c[i]);
        }
        else
        {
            while(h<n)
            {
                h=((2*x*x)-x);
                d=(Math.sqrt(1+(24*h))+1)/6;
                if(((d-(int)d)==0)&&(h<n))
                    c[z++]=h;
                x++;
            }
            for(i=0;i<z;i++)
                System.out.println(c[i]);
        }
    }
}
