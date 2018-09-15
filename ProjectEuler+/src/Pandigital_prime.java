import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Pandigital_prime {

    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));

        int i;
        String a = "123456789";
        ArrayList<Integer> vals = new ArrayList<>();
        ArrayList<Integer> v = new ArrayList<>();
        for(i=2;i<=9;i++){
            compute(a.substring(0,i),vals,0,i-1);
        }

        for(i=0;i<vals.size();i++){
            if(checkprime(vals.get(i)))
                v.add(vals.get(i));
        }
        Collections.sort(v);
        int t = Integer.parseInt(ob.readLine());

        while(t>0){
            long n=Long.parseLong(ob.readLine());
            int num = (n>987654321)?987654321:(int)n;
            int flag=0;
            for(i=v.size()-1;i>=0;i--){
                if(v.get(i)<=num){
                    System.out.println(v.get(i));
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.println("-1");
            t--;
        }
    }

    private static void compute(String num, ArrayList<Integer> vals, int l, int r){
        if (l == r)
            vals.add(Integer.parseInt(num));
        else
        {
            for (int i = l; i <= r; i++)
            {
                num = swap(num,l,i);
                compute(num,vals,l+1, r);
                num = swap(num,l,i);
            }
        }
    }

    private static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    private static boolean checkprime(int num){
        int i;
        for(i=2;i<=(int)(Math.sqrt(num));i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
