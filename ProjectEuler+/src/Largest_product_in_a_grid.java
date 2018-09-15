import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Largest_product_in_a_grid {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int a[][]=new int[20][20];
        int i,j,pud=1,plr=1,prd=1,pld=1,max=0;
        for(i=0;i<20;i++)
        {
            for(j=0;j<20;j++)
                a[i][j]=Integer.parseInt(ob.readLine());
        }
        for(i=0;i<20;i++)
        {
            for(j=0;j<20;j++)
            {
                if((j+3)<20)
                    plr=a[i][j]*a[i][j+1]*a[i][j+2]*a[i][j+3];
                if((i+3)<20)
                    pud=a[i][j]*a[i+1][j]*a[i+2][j]*a[i+3][j];
                if(((i+3)<20)&&((j+3)<20))
                    prd=a[i][j]*a[i+1][j+1]*a[i+2][j+2]*a[i+3][j+3];
                if(((i+3)<20)&&((j-3)>=0))
                    pld=a[i][j]*a[i+1][j-1]*a[i+2][j-2]*a[i+3][j-3];
                if(max<pud)
                    max=pud;
                if(max<plr)
                    max=plr;
                if(max<prd)
                    max=prd;
                if(max<pld)
                    max=pld;
            }
        }
        System.out.println(max);
    }
}
