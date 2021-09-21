static void Main(string[] args)
{
    int[,] arr1 = new int[2,4]{{1,3,5,7},{2,4,6,8}};
    int[] arr2 = new int[4];
    int[] arr3 = new int[4];

    for (int i = 0; i < arr1.Rank; i++)
    {
        for (int j = 0; j < arr1.GetUpperBound(arr1.Rank - 1) + 1; j++)
        {
            switch (i)
            {
                case 0: arr2[j] = arr1[i,j]; break;
                case 1: arr3[j] = arr1[i,j]; break;
            }
        }
    }
    Console.Write("数组一： ");
    foreach (int n in arr2) Console.Write(n + " ");
    Console.WriteLine();
    Console.Write("数组二： ");
    foreach (int n in arr3) Console.Write(n + " ");
    Console.WriteLine();
}
Main(null);