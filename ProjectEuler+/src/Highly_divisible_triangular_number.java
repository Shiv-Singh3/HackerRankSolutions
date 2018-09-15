import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Highly_divisible_triangular_number {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t,n,i,c=1,a,sum=0,x,k,b=0,e=1;
        t=Integer.parseInt(ob.readLine());
        int d[][]=new int[2][1000];
        for(i=1;;i++)
        {
            sum+=i;a=0;
            x=(int)Math.sqrt(sum);
            for(k=1;k<=x;k++)
            {
                if(sum%k==0)
                    a+=2;
            }
            if((x*x)==sum)
                a--;
            if(a>e)
            {
                d[0][b]=sum;
                d[1][b++]=a;
                e=a;
            }
            if(e>1000)
                break;
        }
        while(c<=t)
        {
            n=Integer.parseInt(ob.readLine());
            for(i=0;d[1][i]<=n;i++);
            System.out.println(d[0][i]);
            c++;
        }
    }
}
