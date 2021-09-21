static void Main(string[] args)
{
    int s = 0, num = 80;
    while (s < num)
    {
        s++;
        if (s % 2 == 0)
        {
            continue;
        }
        Console.WriteLine(s);
    }
}
Main(null);