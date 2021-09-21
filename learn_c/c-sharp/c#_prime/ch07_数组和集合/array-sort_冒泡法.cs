static void Main(string[] args)
{
    int[] arr = new int[] {3, 9, 27, 18, 6, 12, 21, 15};

    foreach (int m in arr) Console.Write(m + " ");
    Console.WriteLine();

    //定义两个int类型的变量，分别用来表示数组下标和存储新的（临时的）数组元素
    int j, temp;
    for (int i = 0; i < arr.Length - 1; i++)
    {
        j = i + 1;
        id:
        if(arr[i] > arr[j])
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            goto id;
            foreach (int m in arr) Console.Write(m + " ");
            Console.WriteLine();
        }
        else
        {
            if(j < arr.Length - 1)
            {
                j++;
                goto id;
            }
            foreach (int m in arr) Console.Write(m + " ");
            Console.WriteLine();
        }
    }

/*     foreach (int n in arr) Console.Write(n + " ");
    Console.WriteLine(); */
}
Main(null);

/*
Error: ERROR: Script execution failed. [IndexOutOfRangeException] Index was outside the bounds of the array.
Reason: in "for", put "i < arr.Length", should be "i < arr.Length - 1"
*/