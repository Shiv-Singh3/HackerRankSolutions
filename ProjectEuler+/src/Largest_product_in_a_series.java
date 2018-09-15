import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Largest_product_in_a_series {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int t,n,k,c=1,i,j,p=0,x=1;
        t=Integer.parseInt(ob.readLine());
        String a;
        while(c<=t)
        {
            n=Integer.parseInt(ob.readLine());
            k=Integer.parseInt(ob.readLine());
            a=ob.readLine();
            for(i=0;i<a.length()-k;i++)
            {
                for(j=i;j<(i+k);j++)
                    x=x* (a.charAt(j)-48);
                if(x>p)
                    p=x;
                x=1;
            }
            System.out.println(p);
            c++;p=0;x=1;
        }
    }
}
