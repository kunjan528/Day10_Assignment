//3) Define a class Time. It stores the time in hours and minutes. Create two 
//objects of Time and find the difference in between two objects.
//a) Using member functions
//b) Using constructor

import java.util.Scanner;
public class ConvertTime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min=sc.nextInt();
        int hour1 = sc.nextInt();
        int min1=sc.nextInt();

        TimeDiffer td = new TimeDiffer(hour , min);
        TimeDiffer1 td1= new TimeDiffer1(hour1 , min1);


        // td.TimeDiffer_hr();
        // td.TimeDiffer_min();
         System.out.println(td.toString());
         System.out.println(td1.toString1());
         

         
    }
}
class TimeDiffer{
    private int hour , min ;
   

     public TimeDiffer(int h,int m)
    {
        hour = h;
        min = m;
    }
   
    public int getHour()
    {
        return hour;
    }
    
    public int getMinute()
    {
        return min;
    }
   

    public int getHour12()
    {
        if(hour == 0)
        {
            return 12;
        }else if(hour <= 12)
        {
            return hour;
        }else{
            return hour - 12 ;
        }
    }
    
    public String getAMPM()
    {
        return hour < 12 ? "AM":"PM";
    }
    
     public String toString()
     {
        return String.format("%d : %02d %s",getHour12(),min,getAMPM());
     }
    
}

class TimeDiffer1{
    
    private int hour1 , min1 ;

    
    public TimeDiffer1(int h1 ,int m1)
    {
        hour1 = h1;
        min1 = m1;
    }
    
    public int getHour1()
    {
        return hour1;
    }
    
    public int getMinute1()
    {
        return min1;
    }

    
     public int getHour12_1()
    {
        if(hour1 == 0)
        {
            return 12;
        }else if(hour1 <= 12)
        {
            return hour1;
        }else{
            return hour1 - 12 ;
        }
    }
    
    public String getAMPM_1()
    {
        return hour1 < 12 ? "AM":"PM";
    }
    
     public String toString1()
     {
        return String.format("%d : %02d %s",getHour12_1(),min1,getAMPM_1());
     }
}

