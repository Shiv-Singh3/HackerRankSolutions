import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prime10001st {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int i,j,n,t,c=0,c1=0;
        int p[]=new int[10000];
        for(i=2;;i++)
        {
            for(j=2;j<=(int)(Math.sqrt(i));j++)
                if(i%j==0)
                {
                    c=1;
                    break;
                }
            if(c==0)
                p[c1++]=i;
            c=0;
            if(c1==10000)
                break;
        }
        c1=0;
        t=Integer.parseInt(ob.readLine());
        while(c1<t)
        {
            n=Integer.parseInt(ob.readLine());
            System.out.println(p[n-1]);
            c1++;
        }
    }
}
