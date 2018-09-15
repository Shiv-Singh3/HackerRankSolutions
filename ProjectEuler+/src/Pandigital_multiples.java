import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pandigital_multiples {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n,k,m,x,y=1,z,f=0,c=0,i;
        n=Integer.parseInt(ob.readLine());
        k=Integer.parseInt(ob.readLine());
        for(m=2;m<n;m++)
        {
            int a[]=new int[k+1];
            while(true)
            {
                x=m*y;
                z=x;
                while(z!=0)
                {
                    if((z%10>k)||((a[z%10]>1))||(a[0]==1))
                    {
                        f=1;
                        break;
                    }
                    a[z%10]+=1;
                    z=z/10;
                }
                if(f==1)
                    break;
                for(i=1;i<=k;i++)
                {
                    if(a[i]==1)
                        c++;
                }
                if(c==k)
                {
                    System.out.println(m);
                    break;
                }
                y++;c=0;
            }
            y=1;c=0;f=0;
        }
    }
}
