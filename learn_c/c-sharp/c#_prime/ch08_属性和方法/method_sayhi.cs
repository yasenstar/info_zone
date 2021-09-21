static void Main(string[] args)
{
    SayHi("Xiaoqi");
    Console.ReadLine();
}

static void SayHi(string name)
{
    Console.WriteLine("Hello from Method to " + name);
}

Main(null);