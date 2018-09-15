import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Singular_integer_right_triangles {

    public static void main(String[] args) throws Exception {

        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));

        int i,m,n,limit = 5*(int)(Math.pow(10,6));
        int triplets[] = new int[limit+1];
        int counter[] = new int[limit+1];
        for(m = 2;m <= 1800;m++){
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

        for(i=1;i<(limit+1);i++){
            if(triplets[i]==1){
                counter[i]=counter[i-1]+1;
            }
            else{
                counter[i]=counter[i-1];
            }
        }
        int t = Integer.parseInt(ob.readLine());
        while(t>0){
            int x = Integer.parseInt(ob.readLine());
            System.out.println(counter[x]);
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
