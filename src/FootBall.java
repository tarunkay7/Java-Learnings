import java.util.*;
public class FootBall
{
    String playname,country;
    int goals;

    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        playname = sc.next();
        country  = sc.next();
        goals = sc.nextInt();


    }

    public void display()
    {
        System.out.println(playname);
        System.out.println(goals);
        System.out.println(country);
    }

    public static void main(String args[])
    {
        FootBall messi = new FootBall();
        FootBall ron = new FootBall();
        messi.accept();
        ron.accept();
        messi.display();
        ron.display();
        messi.findMax(ron);
    }

    public  void findMax(FootBall r)
    {
        if(goals>r.goals) System.out.println(playname + "Scored max");
        else System.out.println(r.playname + " Scored Max"); 
    }
}
