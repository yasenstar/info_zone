static void Main(string[] args)
{
    var name = "Bugs Bunny";
    var age = 25;
    var isRabbit = true;

    Type nameType = name.GetType();
    Type ageType = age.GetType();
    Type isRabbitType = isRabbit.GetType();

    Console.WriteLine("name is type " + nameType.ToString());
    Console.WriteLine("age is type " + ageType.ToString());
    Console.WriteLine("isRabiit is type " + isRabbitType.ToString());
}

Main(null);