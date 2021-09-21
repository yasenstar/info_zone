int Add(int x, int y, int z)
{
    return x + y + z;
}

static void Main(string[] args)
{
    //Console.WriteLine("加法的结果为：{0} ", Add(3,5,7));
    Program program = new Program();
    Console.WriteLine("加法的结果为：{0} ", program.Add(3,5,7));
}

Main(null);

/*
(3,5): error CS0246: The type or namespace name `Program' could not be found. Are you missing an assembly reference?
(4,38): error CS0841: A local variable `program' cannot be used before it is declared
ERROR: Script execution failed. [NullReferenceException] Object reference not set to an instance of an object
*/