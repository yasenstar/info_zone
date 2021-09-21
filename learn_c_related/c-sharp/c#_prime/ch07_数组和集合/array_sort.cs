static void Main(string[] args)
{
    int[] arr = new int[] { 3, 9, 27, 6, 18, 12, 21, 56, 15 };

    foreach (int n in arr) Console.Write("{0}", n + " ");
    Console.WriteLine();

    Array.Sort(arr);

    foreach (int n in arr) Console.Write("{0}", n + " ");
    Console.WriteLine();

    Array.Reverse(arr);

    foreach (int n in arr) Console.Write("{0}", n + " ");
    Console.WriteLine();

}
Main(null);