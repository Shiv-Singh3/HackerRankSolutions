import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Special_Pythagorean_triplet {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t,n,d=1;
        long a,b,c,p=0,x;
        t=Integer.parseInt(ob.readLine());
        while(d<=t)
        {
            n=Integer.parseInt(ob.readLine());
            for(a=1;a<(n/2);a++)
            {
                b=((n*n)-(2*n*a))/((2*n)-(2*a));
                c=n-a-b;
                if((((a*a)+(b*b))==(c*c))&&((b>0)&&(c>0)))
                {
                    x=a*b*c;
                    if(x>p)
                        p=x;
                }

            }
            if(p!=0)
            {
                System.out.println(p);
            }
            else
                System.out.println("-1");
            d++;
            p=0;
        }
    }
}
