import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Largest_palindrome_product {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t,n,c=0,i,j,p,d,w=0,b=0;
        int a[]=new int[500];
        t=Integer.parseInt(ob.readLine());
        for(i=101;i<=999;i++)
        {
            for(j=i;j<=999;j++)
            {
                p=i*j;
                d=p;
                while(d!=0)
                {
                    w=(w*10)+(d%10);
                    d=d/10;
                    b++;
                }
                if((w==p)&&(b==6))
                    a[c++]=p;
                w=0;b=0;
            }
        }
        b=1;w=0;
        while(b<=t)
        {
            n=Integer.parseInt(ob.readLine());
            for(i=0;i<c;i++)
            {
                if((a[i]>w)&&(a[i]<n))
                    w=a[i];
            }
            System.out.println(w);
            b++;w=0;
        }
    }
}
