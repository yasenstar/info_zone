//判断输入的年份是否是闰年
static void Main(string[] args)
{
    Console.WriteLine("请输入一个年份：");
    string str = Console.ReadLine();
    
    int year = Int32.Parse(str);

    bool isleapyear = ((year%400)==0)||(((year%4)==0)&&((year%100)!=0));

    string yesno = isleapyear?"是":"不是";

    Console.WriteLine("{0}年{1}闰年", year, yesno);
}

Main();

/*
(6,22): error CS0584: Internal compiler error: The method or operation is not implemented.
(1,2): error CS1593: Delegate `System.Action<string[]>' does not take `0' arguments
*/