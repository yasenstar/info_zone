Random dice = new Random();

for (int i = 1; i <= 10; i++)
{
    int roll = dice.Next(1,7);
    Console.Write("{0}\t", roll);
}