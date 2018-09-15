import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pentagon_numbers {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        long n,k,c,p1,p2,p3,p4;
        double d1,d2;
        n=Long.parseLong(ob.readLine());
        k=Long.parseLong(ob.readLine());
        c=k+1;
        while(c<n)
        {
            p1=((3*c*c)-c)/2;
            p2=((3*(c-k)*(c-k))-(c-k))/2;
            p3=p1-p2;
            p4=p1+p2;
            d1=(Math.sqrt(1+(24*p3))+1)/6;
            d2=(Math.sqrt(1+(24*p4))+1)/6;
            if(((d1-(int)d1)==0)||((d2-(int)d2)==0))
                System.out.println(p1);
            c++;
        }

    }
}
