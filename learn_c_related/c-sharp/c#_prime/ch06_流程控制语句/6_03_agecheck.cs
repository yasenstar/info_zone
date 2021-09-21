//根据输入的年龄，输出相应的字符串
using System;
static void Main(string[] args)
{
    const int i = 18;
    const int j = 30;
    const int k = 50;
    int YourAge = 0;
    Console.WriteLine("请输入你的年龄： ");
    YourAge = int.Parse(Console.ReadLine());
    Console.WriteLine("你的年龄是：{0}", YourAge);
}
Main(null);