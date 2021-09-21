## Enumerations 枚举

An _enumeration_ is a user-defined integer type.

When you declare an enumeration, you specify a set of acceptable values that instances of that enumeration can contain.

3 benefits of using enumerations instead of plain integers:

1. Enumerations make your code easier to maintain by helping to ensure that your variables are assigned only legitimate, anticipated values
2. Enumerations make your code clearer by allowing you to refer to integer values by descriptive names rather than by obscure "magic" numbers
3. Enumerations make your code easier to type, too. When you go to assign a value to an instance of an enumerated type, the Visual Studio .NET IDE will, through IntelliSense, pop up a list box of acceptable values to save you some keystrokes and to remind you of what the possible options are

You can define an enumeration as follows:

```c#
public enum TimeOfDay
{
    Morning = 0,
    Afternoon = 1,
    Evening = 2
}
```

You will typically use this enumeration to pass an appropriate value into a method and iterate through the possible values in a __switch__ statement:

```c#
class EnumExample
{
    public static int Main()
    {
        WriteGreeting(TimeOfDay.Morning);
        return 0;
    }

    static void WriteGreeting(TimeOfDay timeOfDay)
    {
        switch(timeOfDay)
        {
            case TimeOfDay.Morning:
                Console.WriteLine("Good Morning");
                break;
            case TimeOfDay.Afternoon:
                Console.WriteLine("Good Afternoon");
                break;
            case TimeOfDay.Evening:
                Console.WriteLine("Good Evening");
                break;
            default:
                Console.WriteLine("Hello World");
                break;
        }
    }
}
```

## Namespaces

_Namespaces_ provide a way of organizing related classes and other types.

Unlike a file or a component, a namespace is a logical rather than physical grouping.

```c#
namespace CustomerPhoneBookApp
{
    using System;

    public struct Subscriber
    {
        // Code for struct here...
    }
}
```

