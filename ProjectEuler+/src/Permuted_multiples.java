import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Permuted_multiples {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n,k,i,x,j,y,f=0,d=1;
        n=Integer.parseInt(ob.readLine());
        k=Integer.parseInt(ob.readLine());
        for(i=1;i<=n;i++)
        {
            int a[]=new int[10];
            int c[]=new int[6];c[0]=i;
            x=i;
            while(x!=0)
            {
                a[x%10]+=1;
                x=x/10;
            }
            for(j=2;j<=k;j++)
            {
                int b[]=new int[10];
                y=i*j;
                while(y!=0)
                {
                    b[y%10]+=1;
                    y=y/10;
                }
                if(Arrays.equals(a,b))
                {
                    f=1;
                    c[d++]=i*j;
                }
                else
                {
                    f=0;
                    break;
                }
            }
            if(f==1)
            {
                for(j=0;j<k;j++)
                    System.out.print(c[j]+" ");
                System.out.println();
            }
            f=0;d=1;
        }
    }
}
