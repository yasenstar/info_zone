public struct Rect
{
    public double width;
    public double height;
    public double Perimeter()
    {
        return 2 * (width + height);
    }
    public double Area()
    {
        return width * height;
    }
}

static void Main(string[] args)
{
    Rect rect1;
    rect1.width = 5;
    rect1.height = 10;
    Console.WriteLine("矩形的周长为： {0}", rect1.Perimeter());
    Console.WriteLine("矩形的面积为： {0}", rect1.Area());

    // Rect rect2 = new Rect(8,23);     // error: (8,18): error CS1729: The type `Rect' does not contain a constructor that takes `2' arguments
    Rect rect2;
    rect2.width = 8;
    rect2.height = 13;
    Console.WriteLine("矩形的周长为： {0}", rect2.Perimeter());
    Console.WriteLine("矩形的面积为： {0}", rect2.Area());
}

Main(null);