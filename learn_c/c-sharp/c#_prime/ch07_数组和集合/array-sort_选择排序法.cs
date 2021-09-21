static void Main(string[] args)
{
    int[] arr = new int[] {3, 9, 27, 6, 18, 12, 21, 15};
    
    foreach (int n in arr) Console.Write("{0}", n + " ");
    Console.WriteLine();

    int min;
    for (int i = 0; i < arr.Length -1; i++)
    {
        min = i;
        for (int j = i + 1; j < arr.Length; j++)
        {
            if (arr[j] < arr[min])
                min = j;
        }
        int t = arr[min];
        arr[min] = arr[i];
        arr[i] = t;
        foreach (int n in arr) Console.Write("{0}", n + " ");
        Console.WriteLine();
    }
    Console.WriteLine("Final Result: ");
    foreach (int n in arr) Console.Write("{0}", n + " ");
    Console.WriteLine();
}
Main(null);