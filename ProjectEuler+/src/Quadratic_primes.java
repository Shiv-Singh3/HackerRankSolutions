import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Quadratic_primes {

    public static void main(String[] args) throws IOException {

        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(ob.readLine());
        int isprime[]= new int[2000000];
        ArrayList<Integer> primes = new ArrayList<>();
        computeprimes(isprime,primes);
        int i,j,ans=0,x=0,y=0;
        for(i=-n;i<=n;i++){
            for(j=0;j<primes.size();j++){
                if(primes.get(j)>n)
                    break;
                int b=primes.get(j);
                int c=0;
                while(true){
                    if(check(i,b,c,isprime))
                        c++;
                    else
                        break;
                }
                if(ans<c){
                    ans=c;
                    x=i;
                    y=b;
                }
                c=0;
                while(true){
                    if(check(i,-b,c,isprime))
                        c++;
                    else
                        break;
                }
                if(ans<c){
                    ans=c;
                    x=i;
                    y=b;
                }
            }
        }
        System.out.println(x+" "+y);
    }

    private static void computeprimes(int isprime[], ArrayList<Integer> primes){
        int i,j;
        isprime[0]=isprime[1]=1;
        for(i=2;i<=1000000;i++){
            if(isprime[i]==0){
                primes.add(i);
            }
            for(j=2*i;j<=1000000;j+=i){
                isprime[j]=1;
            }
        }
    }

    private static boolean check(int a, int b, int n, int isprime[]){
        return isprime[Math.abs(compute(a, b, n))] != 1;
    }

    private static int compute(int a, int b, int n){
        return (n*n + n*a + b);
    }
}
