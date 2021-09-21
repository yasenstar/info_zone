public class Program
{
    static void Main(string[] args)
    {
        ReferenceAndValue.Demonstration();
        Console.ReadLine();
    }
}

public class stamp
{
    public string Name {get; set;}
    public int Age {get; set;}
}
public static class ReferenceAndValue
{
    public static void Demonstration()
    {
        stamp Stamp_1 = new stamp { Name = "Premiere", Age = 25 };
        stamp Stamp_2 = new stamp { Name = "Again", Age = 47 };
        int age = Stamp_1.Age;
        Stamp_1.Age = 22;
        stamp guru = Stamp_2;
        Stamp_2.Name = "Again Amend";
        Console.WriteLine("Stamp_1's age:{0}", Stamp_1.Age);
        Console.WriteLine("age's value: {0}", age);
        Console.WriteLine("Stamp_2's name:{0}", Stamp_2.Name);
        Console.WriteLine("guru's name:{0}", guru.Name);
        Console.ReadKey();
    }
}