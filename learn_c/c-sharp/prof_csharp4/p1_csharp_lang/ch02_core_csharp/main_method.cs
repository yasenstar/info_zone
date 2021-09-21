static void Main(string[] args)
{
    MathExample.Main();
}

class MathExample
{
    static int Times(int x, int y)
    {
        return x * y;
    }
    public static int Main()
    {
        int i = Times(5,10);
        Console.WriteLine(i);
        return 0;
    }
}

Main(null);