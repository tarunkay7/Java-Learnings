import java.util.*;
class Movie
{
    private String moviename;
    private double moneyspent;
    private String lang;
    private double moneycollection;

    public void setMovieName(String mname)
    {
        this.moviename = mname;
    }

    public void setLanguage(String l)
    {
        this.lang = l;
    }

    public void setMoneyspent(double moneyspent)
    {
        this.moneyspent = moneyspent;
    }

    public void setMoneycollection(double moneycollection)
    {
        this.moneycollection = moneycollection;
    }

    public String getMovieName()
    {
        return this.moviename;
    }

    public String getLanguage()
    {
        return this.lang;
    }
    public double getMoneyspent()
    {
        return this.moneyspent;
    }
    
    public double getMoneyCollection()
    {
        return this.moneycollection;
    }
}

class MovieShow
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Movie m1 = new Movie();

        System.out.print("Enter moviename: ");
        String moviename = sc.next();
        System.out.println();
        System.out.print("Enter Movie language: ");
        String l = sc.next();
        System.out.println();
        System.out.print("Enter Money Spent");
        double monspent = sc.nextDouble();
        System.out.println();
        System.out.print("Money collected");
        double moncol = sc.nextDouble();
        System.out.println();
        sc.close();

        m1.setMovieName(moviename);
        m1.setLanguage(l);
        m1.setMoneycollection(moncol);
        m1.setMoneyspent(monspent);

        System.out.println("/nMovie Name: " + m1.getMovieName()  + " "+ "\n" +"Language: " + m1.getLanguage() + "\n" +"MoneySpent: " + m1.getMoneyspent() + "\n" + "Moneycollections: " + m1.getMoneyCollection());

        double monspet = m1.getMoneyspent();
        double mc = m1.getMoneyCollection();
        if(mc>monspet + (0.1*monspet))
        System.out.println("Movie is a HIT");
        else if(monspet-(0.1*monspet)<mc&&(monspet+(0.1*monspet)>mc))
        System.out.println("Movie is a Average");
        else System.out.println("Movie is a FLOP");
    
    }
}

