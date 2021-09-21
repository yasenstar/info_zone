using System;
using System.Collections;

static void Main(string[] args)
{
    ArrayList List = new ArrayList();
    for (int i = 0; i < 20; i++)
    {
        List.Add(i);
    }
    foreach(int n in List)
    {
        Console.Write("{0} ", n*n*n);
    }
}
Main(null);