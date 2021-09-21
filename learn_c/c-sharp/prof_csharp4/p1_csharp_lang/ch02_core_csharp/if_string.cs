// using System;

static void Main(string[] args)
{
    Console.WriteLine("Please type in a string:");
    string input;
    input = Console.ReadLine();
    if (input == "")
    {
        Console.WriteLine("You typed in an empty string.");
    }
    else if (input.Length < 5)
    {
        Console.WriteLine("The string had less than 5 characters.");
    }
    else if (input.Length < 20)
    {
        Console.WriteLine("The string had at least 5 but less than 20 characters.");
    }
    Console.WriteLine("The string you typed was: " + input);
}

Main(null);