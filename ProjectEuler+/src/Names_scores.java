import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Names_scores {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n,q,i,j,sum=0;
        n=Integer.parseInt(ob.readLine());
        String a[]=new String[n];
        String temp;
        for(i=0;i<n;i++)
            a[i]=ob.readLine();
        q=Integer.parseInt(ob.readLine());
        String b[]=new String[q];
        int d[]=new int[q];
        for(i=0;i<q;i++)
            b[i]=ob.readLine();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if((a[j].compareTo(a[j+1]))>0)
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(i=0;i<q;i++)
        {
            for(j=0;j<n;j++)
            {
                if(b[i].equals(a[j]))
                {
                    d[i]=j;
                    break;
                }
                else
                    d[i]=-1;
            }
        }
        for(i=0;i<q;i++)
        {
            for(j=0;j<a[d[i]].length();j++)
                sum=sum+(a[d[i]].charAt(j)-64);
            System.out.println((sum*(d[i]+1)));
            sum=0;
        }
    }
}
