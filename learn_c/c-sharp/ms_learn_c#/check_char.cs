// string[] orderID = new string[8];

string[] orderID = { "B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179" };

foreach (string items in orderID)
{
    // Console.Write($"{items}\t");
    if (items.StartsWith("B"))
    {
        Console.WriteLine(items);
    }
}