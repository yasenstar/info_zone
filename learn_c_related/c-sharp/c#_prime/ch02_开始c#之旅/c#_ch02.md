# 命名规范

## Pascal规则

用Pascal规则来命名方法和类型，即第一个字母必须大写，并且后面的连接词的第一个字母均为大写。

如：定义一个公共类，并在该类中创建一个公共方法。

```c#
public class DataGrid               // 创建一个公共类
{
    public voic DataBine()          // 在公共类中创建一个公共方法
    {

    }
}
```

## Camel规则

第一个单词的第一个字母小写。

如：声明一个字符串变量和创建一个公共方法

```c#
string strUserName;
public void addUser(string strUserId, byte[] byPassword);
```

## 所有的成员变量前加前缀 “_”。

```c#
Public class DataBase
{
    private string _connectionString;   //声明一个私有成员变量
}
```

## 接口的名称前缀加 “I”

```c#
public interface Iconvertible
{
    byte ToByte();
}
```

## 方法的命名，一般为动宾短语

```c#
public class File
{
    public voic CreateFile(string filePath)
    {

    }
    public void GetPath(string path)
    {

    }
}
```

## 所有的成员变量声明在类的顶端，用一个换行把它和方法分开。

```c#
public class Product
{
    private string _productId;
    private string _productName;
    public void AddProduct(string productId, string productName)
    {

    }
}
```

