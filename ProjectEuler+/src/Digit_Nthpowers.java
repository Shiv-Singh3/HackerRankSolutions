import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Digit_Nthpowers {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n,a,s=0,sum=0,i;
        n=Integer.parseInt(ob.readLine());
        for(i=2;i<=(n*(int)Math.pow(9,n));i++)
        {
            a=i;
            while(a!=0)
            {
                s+=(int)Math.pow((a%10),n);
                a=a/10;
            }
            if(s==i)
                sum+=s;
            s=0;
        }
        System.out.println(sum);
    }
}
