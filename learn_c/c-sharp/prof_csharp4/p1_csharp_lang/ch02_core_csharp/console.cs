static void Main(string[] args)
{
    /// <c>int i = 940;</c>
    int i = 940;
    int j = 73;
    Console.WriteLine("{0} plus {1} = {2}", i, j, i+j);
    Console.WriteLine(" {0,4}\n+{1,4}\n-----\n {2,4}", i, j, i+j);
    decimal x = 940.23m;
    decimal y = 73.7m;
    Console.WriteLine(" {0,9:C2}\n+{1,9:C2}\n-----------\n {2,9:C2}", x, y, x+y);
}
Main(null);