static void Main(string[] args)
{
    int[] arr = new int[]{3,9,27,6,18,15,21};
    foreach (int n in arr)
        Console.Write("{0}", n + " ");
    Console.WriteLine();

    for (int i = 0; i < arr.Length; i++)
    {
        int temp = arr[i];
        int j = i;
        while ((j > 0) && (arr[j-1] > temp))
        {
            arr[j] = arr[j-1];
            --j;
        }
        arr[j] = temp;
        foreach (int n in arr)
            Console.Write("{0}", n + " ");
        Console.WriteLine();
    }

    Console.WriteLine("排序后的结果： ");
    foreach (int n in arr)
        Console.Write("{0}", n + " ");
    Console.WriteLine();
}
Main(null);