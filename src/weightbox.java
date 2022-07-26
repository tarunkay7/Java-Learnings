public class weightbox extends Box {
    private int weight;

    public weightbox(int x) {
        super(x);
    }
    
    public weightbox(int x,int y)
    {
        super(x);
        weight = y;

    }

    public weightbox()
    {
        super();
        weight=0;
    }

    public weightbox(int length, int breadth, int height, int weight) {
        super(length, breadth, height);
        this.weight = weight;
    }

    public int volume(){
        int v = this.weight*super.volume();
        return v;
    }

    public String toString() {
        return super.toString()
        + "weightbox [weight=" + weight + "]";
    }


    
}


