class MyClass
{
    private int x = 0;
    private int y = 0;
    private int z = 0;
    public int X
    {
        get { return x; }
        set { x = value; }
    }
    public int Y
    {
        get { return y; }
        set { y = value; }
    }
    public int Z
    {
        get { return z; }
        set { z = value; }
    }
    public MyClass() {}
}

static void Main(string[] args)
{
    int x = 3;
    int y = 5;
    MyClass myclass = new MyClass();
    myclass.X = x;
    myclass.Y = y;
    myclass.Z = myclass.X + myclass.Y;
    int z = myclass.Z;
    Console.WriteLine(z);
}

Main(null);