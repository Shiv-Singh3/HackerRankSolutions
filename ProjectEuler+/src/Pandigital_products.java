import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pandigital_products {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n,sum=0,i,p=12,x,j,f;
        n=Integer.parseInt(ob.readLine());
        String z="";
        for(i=n;i>((n/2)+(n%2));i--)
            z+=(Integer.toString(i));
        while(p<Integer.parseInt(z))
        {
            for(i=2;i<(p/2);i++)
            {
                f=0;
                int a[]=new int[n];
                if(p%i!=0)
                    continue;
                x=p/i;
                String b=Integer.toString(p)+Integer.toString(x)+Integer.toString(i);
                for(j=0;j<b.length();j++)
                {
                    if(((b.charAt(j)-48)>n)||((b.charAt(j)-48)==0))
                    {
                        f=1;
                        break;
                    }
                    a[b.charAt(j)-48-1]+=1;
                }
                if(f==1)
                    continue;
                for(j=0;j<n;j++)
                {
                    if(a[j]!=1)
                    {
                        f=1;
                        break;
                    }
                }
                if(f==0)
                {
                    sum+=p;
                    break;
                }
            }
            p++;
        }
        System.out.println(sum);
    }
}
