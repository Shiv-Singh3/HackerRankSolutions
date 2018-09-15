import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coded_triangle_numbers {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        long t,n,c=1;
        t=Long.parseLong(ob.readLine());
        while(c<=t)
        {
            n=Long.parseLong(ob.readLine());
            double d;
            d=(Math.sqrt(1+(8*n))-1)/2;
            if((d-(int)d==0))
                System.out.println((int)d);
            else
                System.out.println("-1");
            c++;
        }
    }
}
