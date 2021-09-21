static void Main(string[] args)
{
    int[] myNum = new int[6] { 927, 112, 111, 524, 521, 2008 };
    int s = 0;
    while (s < 6)
    {
        Console.WriteLine("myNum[{0}]的值为{1}", s, myNum[s]);
        s++;
    }
}
Main(null);