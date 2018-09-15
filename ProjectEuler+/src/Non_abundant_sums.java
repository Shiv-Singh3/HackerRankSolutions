import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Non_abundant_sums {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t,n,i,j,c=1,sum=0,b=1,f=0;
        t=Integer.parseInt(ob.readLine());
        int a[]=new int[10000];
        a[0]=12;
        for(i=13;i<=28123;i++)
        {
            for(j=1;j<=i/2;j++)
            {
                if(i%j==0)
                    sum+=j;
            }
            if(sum>i)
                a[b++]=i;
            sum=0;
        }
        while(c<=t)
        {
            n=Integer.parseInt(ob.readLine());
            if(n>28123)
                System.out.println("YES");
            else
            {
                for(i=0;i<b;i++)
                {
                    for(j=i;j<b;j++)
                    {
                        if((a[i]+a[j])==n)
                        {
                            System.out.println("YES");
                            f=1;
                            break;
                        }
                    }
                    if(f==1)
                        break;
                }
                if(f==0)
                    System.out.println("NO");
            }
            f=0;c++;
        }
    }
}
