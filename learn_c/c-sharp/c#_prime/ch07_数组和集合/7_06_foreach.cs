static void Main(string[] args)
{
    //int[] arr = {1,2,3,4,5};  // OK

    //int[] arr = int[5]{1,2,3,4,5};
    // above has error: ERROR: Script execution failed. [NullReferenceException] Object reference not set to an instance of an object

    int[] arr = new int[5]{1,2,3,4,5};  // OK with adding 'new'

    foreach (int n in arr)
        Console.WriteLine("{0}", n + " ");
}
Main(null);