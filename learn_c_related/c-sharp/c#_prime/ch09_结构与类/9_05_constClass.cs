class Program
{
    public int x = 3;
    public int y = 5;
    public int z = 0;
    public Program()
    {
        z = x + y;
    }
}
static void Main(string[] args)
{
    Program program = new Program();
    Console.WriteLine("Result is: {0}", program.z);
}
Main(null);