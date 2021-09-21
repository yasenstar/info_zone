static void Main(string[] args)
{
    for (int i = 0; i < 4; i++)
    {
        Console.Write("\n 第{0}次循环：", i);
        for (int j = 0; j < 200; j++)
        {
            if (j == 48) break;
            Console.Write(j + " ");
        }
    }
}
Main(null);