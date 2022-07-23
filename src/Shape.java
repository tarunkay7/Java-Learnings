class Shape
{
    public void  area(int a,int b,int c)
    {
        double s= (a+b+c)/2;
        double res = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle is "+ res);
    }
    public void  area(int bas,int wid)
    {
        System.out.println("Area of Rectangle is "+ (bas*wid));
    }
    public void area(int rad)
    {
        System.out.println("Area of Circle is "+ (3.14*rad*rad));

    }

    public static void main(String[] args)
    {
        Shape s1 = new Shape();
        s1.area(4,5,6);
        s1.area(6,7);
        s1.area(5);
    }
    

    

}