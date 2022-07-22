public class Time {

    private int  hours;
    private int minutes;
    private int seconds;

    public Time(int h,int m , int s)
    {
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }

    public Time(int se)
    {
       this.seconds = se%60;
       this.minutes = se/60;
       this.hours= this.minutes/60;
       this.minutes = this.minutes%60;
    }

    public Time(Time t1, Time t2)
    {
        this.seconds = t1.seconds + t2.seconds;
        if(this.seconds>=60)
        {
            this.seconds = this.seconds-60;
            this.minutes = t1.minutes+t2.minutes+1;
        }

       else if(this.minutes>=60)
        {
            this.minutes = this.minutes-60;
            this.hours = t1.hours+t2.hours+1;
        }

        else
        {
            this.hours = t1.hours+t2.hours;
        }


    }

    public void display()
    {
        System.out.println(this.hours+":"+this.minutes+":"+this.seconds);

    }

    
}

class TimeDemo
{
    public static void main(String[] args)
    {
        Time t1 = new Time(9,30,45);
        Time t2 = new Time(5000);
        Time t3 = new Time(t1,t2);
        System.out.println("T1 is");
        t1.display();
        System.out.println("T2 is ");
        t2.display();
        System.out.println("T3 is ");
        t3.display();


    }
}
