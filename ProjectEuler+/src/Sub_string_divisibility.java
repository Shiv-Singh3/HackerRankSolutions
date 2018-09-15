import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sub_string_divisibility {

    public static void main(String[] args) throws Exception {

        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(ob.readLine());
        String a = "0123456789";
        int b[] = {2,3,5,7,11,13,17};
        ArrayList<String> vals = new ArrayList<>();
        if(n!=9){
            compute(a.substring(0,n+1),vals,0,n);
        }
        else{
            compute1(a,vals, '0');
            compute1(a,vals, '5');
        }
        int i;
        long sum=0;
        for(i=0;i<vals.size();i++){
            String num = vals.get(i);
            int si=1,ei=4,length=num.length(),ind=0,flag=0;
            while(ei<=length){
                int x = Integer.parseInt(num.substring(si++,ei++));
                if(x%b[ind++]!=0){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                sum+=Long.parseLong(num);
        }
        System.out.println(sum);
    }

    private static void compute1(String num, ArrayList<String> vals, char key){
        int ind = num.indexOf(key);
        String a = (ind>0)?num.substring(0,ind):"";
        String b = num.substring(ind+1);
        String c = a+b;
        ArrayList<String> temp = new ArrayList<>();
        compute(c,temp,0,c.length()-1);
        for (String aTemp : temp) {
            String d = aTemp.substring(0, 5);
            String e = aTemp.substring(5);
            String f = d + key + e;
            //System.out.println(f);
            vals.add(f);
        }
    }

    private static void compute(String num, ArrayList<String> vals, int l, int r){
        if (l == r)
            vals.add(num);
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
}
