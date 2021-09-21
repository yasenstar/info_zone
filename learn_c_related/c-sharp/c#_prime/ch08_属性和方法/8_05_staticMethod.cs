static int Add(int x, int y, int z)
{
    return x + y + z;
}

static void Main(string[] args)
{
    Console.WriteLine("加法的结果为：{0} ", Add(3,5,7));
}

Main(null);