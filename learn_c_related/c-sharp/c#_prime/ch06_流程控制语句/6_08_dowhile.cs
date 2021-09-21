static void Main(string[] args)
{
    bool term = false;
    int[] myArray = new int[5] { 0, 1, 2, 3, 4 };
    do
    {
        for (int i = 0; i < myArray.Length; i++)
        {
            Console.WriteLine(myArray[i]);
        }
    } while (term);
}
Main(null);