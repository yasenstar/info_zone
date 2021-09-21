static void Main(string[] args)
{
    //定义两个一维数组
    int[] arr1 = new int[] {1,2,3,4,5};
    foreach (int n in arr1) Console.Write("{0}", n + " ");
    Console.WriteLine();

    int[] arr2 = new int[] {5,6,7,8,9};
    foreach (int n in arr2) Console.Write("{0}", n + " ");
    Console.WriteLine();

    //合并为一个一维数组
    int m = arr1.Length + arr2.Length;
    Console.WriteLine("总长度为：{0}", m);

    int[] arr3 = new int[m];

    for (int i = 0; i < arr3.Length; i++)
    {
        if (i < arr1.Length) {arr3[i]=arr1[i];}
        else {arr3[i] = arr2[i-arr1.Length];}
    }

    Console.WriteLine("合并为一维数组后的数组为：");
    foreach (int n in arr3) Console.Write("{0}", n + " ");
    Console.WriteLine();

    //合并为一个二维数组
    int l = Math.Max(arr1.Length,arr2.Length);
    int[,] arr4 = new int[2,l];
    for (int i = 0; i < arr4.Rank; i++)
    {
        switch(i)
        {
            case 0:
            {
                for (int j = 0; j < arr1.Length; j++) {arr4[i,j] = arr1[j];}
                break;
            }
            case 1:
            {
                for (int j = 0; j < arr2.Length; j++) {arr4[i,j] = arr2[j];}
                break;
            }
        }
    }
    Console.WriteLine("合并为二维数组后的数组为：");
    for (int i = 0; i < arr4.Rank; i++)
    {
        for (int j = 0; j < arr4.GetUpperBound(arr4.Rank - 1) + 1; j++)
            Console.Write(arr4[i,j] + " ");
        Console.WriteLine();
    }
}
Main(null);