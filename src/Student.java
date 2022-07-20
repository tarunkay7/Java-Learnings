import java.util.*;
public class Student {

    int studid;
    double fees,cgpa;
    String studname;

    public void Accept(){
        Scanner sc = new Scanner(System.in);

        studid = sc.nextInt();
        fees = sc.nextDouble();
        cgpa = sc.nextDouble();
        studname = sc.nextLine();
        sc.close();


    }

    public double CalculateDiscount()
    {

        if(cgpa>=9) return 0.5*fees;
        else if(cgpa<9 && cgpa >=8) return 0.25*fees;
        else if(cgpa<8 && cgpa >=7) return 0.10*fees;
        else return fees;
    }

    public void display()
    {
        System.out.println("\nStudent name is "  + studname + "\n" + "Student id " + studid + "\n" + "fees"  + fees  + "\n" + "Fee after Discount is " + CalculateDiscount());

    }

    public static void main(String args[])
    {
        Student student1 = new Student();
        student1.Accept();
        student1.CalculateDiscount();
        student1.display();
    }
    
}
