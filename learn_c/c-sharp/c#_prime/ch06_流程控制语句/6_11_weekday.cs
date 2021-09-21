//声明整型变量，获取当前日期的返回值，通过switch判断当前日期是星期几
static void Main(string[] args)
{
    int i = Convert.ToInt32(DateTime.Today.DayOfWeek);
    switch (i)
    {
        case 1: Console.WriteLine("今天是星期一"); break;
        case 2: Console.WriteLine("今天是星期二"); break;
        case 3: Console.WriteLine("今天是星期三"); break;
        case 4: Console.WriteLine("今天是星期四"); break;
        case 5: Console.WriteLine("今天是星期五"); break;
        case 6: Console.WriteLine("今天是星期六"); break;
        case 7: Console.WriteLine("今天是星期日"); break;
    }
}
Main(null);