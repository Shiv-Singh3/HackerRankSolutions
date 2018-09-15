import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circular_primes {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(ob.readLine()),c,a,i,f,b,j,e,k,g;
        long sum=17;
        for(i=11;i<n;i+=2)
        {
            a=i;b=0;f=0;e=0;g=0;
            while(a!=0)
            {
                c=a%10;
                if((c==2)||(c==4)||(c==6)||(c==8)||(c==5)||(c==0))
                {
                    f=1;
                    break;
                }
                b++;
                a=a/10;
            }
            if(f==1)
            {
                continue;
            }
            a=i;
            int d[]=new int[b];
            for(j=b-1;j>=0;j--)
            {
                d[j]=a%10;
                a=a/10;
            }
            for(j=0;j<b;j++)
            {
                for(k=j;k<b;k++)
                    e=(e*10)+d[k];
                for(k=0;k<j;k++)
                    e=(e*10)+d[k];
                for(k=2;k<=(int)Math.sqrt(e);k++)
                {
                    if(e%k==0)
                    {
                        g=1;
                        break;
                    }
                }
                if(g==1)
                    break;
                e=0;
            }
            if(g==0)
                sum=sum+i;
        }
        System.out.println(sum);
    }
}
