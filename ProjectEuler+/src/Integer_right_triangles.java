import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Integer_right_triangles {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));

        int i,m,n,limit = 5*(int)(Math.pow(10,6)),a=-1,b=-1;
        int triplets[] = new int[limit+1];
        int maxcounter[] = new int[limit+1];
        for(m = 2;m <= 1200;m++){
            for(n = 1;n<m;n++){
                if((m%2==0||n%2==0)&&gcd(m,n)){
                    int p = 2*m*(m+n),k=1;
                    while((k*p)<=limit){
                        triplets[k*p]+=1;
                        k++;
                    }
                }
            }
        }

        for(i = 0;i<=limit;i++){
            if(triplets[i]>a){
                a=triplets[i];
                b=i;
            }
            maxcounter[i]=b;
        }

        int t = Integer.parseInt(ob.readLine());
        while(t>0){
            int x = Integer.parseInt(ob.readLine());
            System.out.println(maxcounter[x]);
            t--;
        }
    }

    private static boolean gcd(int m, int n){
        while(m!=n){
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
        return m == 1;
    }
}
