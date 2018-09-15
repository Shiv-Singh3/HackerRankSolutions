import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Smallest_multiple {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(ob.readLine());
        int n,c=1,b,d,f,x=1,i;
        int e[]={2,3,5,7,11,13,17,19,23,29,31,37};
        while(c<=t)
        {
            int a[]=new int[12];
            n=Integer.parseInt(ob.readLine());
            for(i=2;i<=n;i++)
            {
                b=i;d=0;f=0;
                while(b!=1)
                {
                    if(b%e[f]==0)
                    {
                        d++;
                        b=b/e[f];
                    }
                    if((b%e[f]!=0)||(b==1))
                    {
                        if(a[f]<d)
                            a[f]=d;
                        f++;
                        d=0;
                    }
                }
            }
            for(i=0;i<12;i++)
            {
                if(a[i]!=0)
                {
                    x=x*(int)(Math.pow(e[i],a[i]));
                }
            }
            System.out.println(x);
            x=1;c++;
        }
    }
}
