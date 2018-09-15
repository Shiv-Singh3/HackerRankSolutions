import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Goldbach_other_conjecture {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t,n,i,c=0,x=0,b=5*(int)(Math.pow(10,5)),j,f=0,y=0,d=0;
        t=Integer.parseInt(ob.readLine());
        int a[]=new int[b];
        for(i=2;i<(b-1);i++)
        {
            for(j=2;j<=(int)(Math.sqrt(i));j++)
            {
                if(i%j==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
                a[x++]=i;
            f=0;
        }
        while(c<t)
        {
            n=Integer.parseInt(ob.readLine());
            for(i=1;i<=(int)(Math.sqrt(n));i++)
            {
                while((y<x)&&(a[y]<n))
                {
                    if((a[y++]+(2*i*i))==n)
                        d++;
                }
                y=0;
            }
            System.out.println(d);
            d=0;c++;
        }
    }
}
