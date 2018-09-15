import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Double_base_palindromes {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n,k,i,sum=0,rev=0,t,j;
        String a="",rev1="";
        n=Integer.parseInt(ob.readLine());
        k=Integer.parseInt(ob.readLine());
        if((n>=10)&&(n<=1000000)&&(k>=2)&&(k<=9))
        {
            for(i=1;i<=n;i++)
            {
                t=i;
                while(t!=0)
                {
                    rev=(rev*10)+(t%10);
                    t=t/10;
                }
                if(rev==i)
                {
                    while(rev!=0)
                    {
                        a=(rev%k)+a;
                        rev=rev/k;
                    }
                    for(j=a.length()-1;j>=0;j--)
                        rev1=rev1+a.charAt(j);
                    if(a.equals(rev1))
                        sum=sum+i;
                }
                rev=0;
                a="";
                rev1="";
            }
            System.out.println(sum);
        }
    }
}
