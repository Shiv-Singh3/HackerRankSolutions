import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Lychrel_numbers {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(ob.readLine());
        int i,max=-1;
        long num=-1;
        HashMap<String,Integer> pal = new HashMap<>();
        for(i=1;i<=n;i++){
            long x = i,length=0,flag=-1;
            while(!checkpal(x)){
                length++;
                if(length==60 || x>(long)(Math.pow(10,15))){
                    flag=1;
                    break;
                }
                x=x+reverse(x);
            }
            if(flag==-1){
                int value = 0;
                if(pal.containsKey(String.valueOf(x))){
                    value=pal.get(String.valueOf(x));
                }
                pal.put(String.valueOf(x),value+1);
                if(max<pal.get(String.valueOf(x))){
                    max=pal.get(String.valueOf(x));
                    num = x;
                }
            }
        }
        System.out.println(num + " " +max);
    }

    private static long reverse(long x){
        long rev=0,t=x;
        while(t!=0){
            rev=(rev*10)+(t%10);
            t=t/10;
        }
        return rev;
    }

    private static boolean checkpal(long x){
        long rev = reverse(x);
        return x == rev;
    }
}
