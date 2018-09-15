import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Counting_Sundays {

    public static void main(String[] args)throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(ob.readLine());

        while(t>0){
            String start_date = ob.readLine();
            String end_date = ob.readLine();
            String sdate[] = start_date.split(" ");
            String edate[] = end_date.split(" ");
            long sy,sm,sd,ey,em,ed;
            long count =0;
            sy=Long.parseLong(sdate[0]);
            sm=Long.parseLong(sdate[1]);
            sd=Long.parseLong(sdate[2]);
            ey=Long.parseLong(edate[0]);
            em=Long.parseLong(edate[1]);
            ed=Long.parseLong(edate[2]);

            if(sd>1){
                sd=1;
                sm++;
                if(sm>12){
                    sm=1;
                    sy++;
                }
            }
            while(sy<ey || (sy==ey && sm<=em)){
                long day = Zellercongruence(sd,sm,sy);
                if(day==1){
                    //System.out.println(sm+" "+sy);
                    count++;
                }
                sm++;
                if(sm>12){
                    sy++;
                    sm=1;
                }
            }

            System.out.println(count);
            t--;
        }
    }

    static long Zellercongruence(long day, long month,long year)
    {
        if (month == 1)
        {
            month = 13;
            year--;
        }
        if (month == 2)
        {
            month = 14;
            year--;
        }
        long q = day;
        long m = month;
        long k = year % 100;
        long j = year / 100;
        long h = q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h = h % 7;
        return h;
    }
}
