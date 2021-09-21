Console.WriteLine("Generating invoice for customer \"ABC Core\" ...\n");
Console.WriteLine("Invoice: 1021\t\tComplete!");
Console.WriteLine("Invoice: 1022\t\tComplete!");
Console.WriteLine("\nOutput Directory:\t");
//Console.WriteLine(@"   c:\source\repos
//     (this is where your code goes)");
Console.WriteLine(@"c:\invoices");
// Kon'nichiwa world
Console.WriteLine("\u3053\u3093\u306B\u3061\u306f World!");
Console.WriteLine(@"c:\invoices\app.exe -j");

string firstName = "Bob";
string greeting = "Hello";
//string message = greeting + " " + firstName;
Console.WriteLine(greeting + " " + firstName);
Console.WriteLine("{0} {1}", greeting, firstName);

// string interpolation:
// a variable surrounded by an opening and closing curly brace symbol {}
string message = $"{greeting} {firstName}!";
Console.WriteLine(message);

string projectName = "Yasen-Project";
Console.WriteLine($@"C:\Output\{projectName}\Data");

// challenge:
string projectName = "ACME";
string russianMessage = "\u041f\u043e\u0441\u043c\u043e\u0442\u0440\u0435\u0442\u044c \u0440\u0443\u0441\u0441\u043a\u0438\u0439 \u0432\u044b\u0432\u043e\u0434";

Console.WriteLine("View English output:");
Console.WriteLine($@"\t\tc:\Exercise\{projectName}\data.txt");

Console.WriteLine();

Console.WriteLine(russianMessage + ":");
Console.WriteLine($@"\t\tc:\Exercise\{projectName}\ru-RU\data.txt");