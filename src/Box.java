class Box
{
    private int length,breadth,height;

    public Box()
    {
        this.length = this.breadth = this.height=0;
    }

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public Box(int x) {
        this.length = x;
        this.breadth = x;
        this.height = x;

    }
    public int volume()
    {
        return this.breadth*this.length*this.height;
    }

    public String toString() {
        return "Box [breadth=" + breadth + ", height=" + height + ", length=" + length + "]";
    }

    
}

