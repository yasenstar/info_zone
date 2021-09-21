# 1. 什么是计算机程序

程序：一组计算机能识别和执行的指令。

# 2. 什么是计算机语言

计算机语言经历了以下几个发展阶段：

| 语言阶段 | 特点 |
| ------ | ------ |
| 机器语言 | 计算机能直接识别和接受的二进制代码成为机器指令 (machine instruction)，机器指令的集合就是机器语言 (machine language) |
| 符号语言 | Symbolic Language，用一些英文字母和数字表示一个指令。由于计算机并不能直接识别和执行符号语言的指令，需要用一种称为汇编程序的软件把符号语言的指令转换为机器指令。转换的过程称为“代真”或“汇编”，因此，符号语言又称为符号汇编语言 (symbolic assembler language) 或汇编语言 (assembler language) |
| 高级语言 | 程序中用到的语句和指令用英文单词表示，功能很强且不依赖于具体机器，对任何型号的计算机都适用，称为高级语言 (high level language)，高级语言需要用一种称为编译程序的软件将源程序(source program)转换为机器指令的程序-目标程序(object program)，然后让计算机执行并得到结果。高级语言经历了非结构化的语言（BASIC, FORTRAN, ALGOL等）、结构化语言（QBASIC, FORTRAN 77, C等）两个基于过程的语言阶段，到面向对象的语言（C++, C#, Visual Basic, Java）阶段。 |

# 3. C语言的发展和特点

C语言的主要特点是

1. 语言简洁、紧凑，使用方便、灵活
2. 运算符丰富，共有34种运算符
3. 数据类型丰富
4. 具有结构化的控制语句，用函数作为程序的模块单位
5. 语法限制不太严格，程序设计自由度大
6. C语言允许直接访问物理地址，能进行位bit操作，能实现汇编语言的大部分功能，可以直接对硬件进行操作
7. 程序可移植性好
8. 生成目标代码质量高，程序执行效率高

# 4. 第一个C语言程序

例子目标：在屏幕输出一行文本信息

```
#include <stdio.h>
int main()
    {
        printf("This is a C program.\n");
        return 0;
    }
```

使用QT来作为集成开发环境，默认是C++程序，如下创建一个新的项目，给程序命名为：text_print.cpp

```
#include <QCoreApplication>

int main(int argc, char *argv[])
{
    QCoreApplication a(argc, argv);

    printf("hello world\n");

    printf("This is a C program.\n");

    return a.exec();
}
```

编译运行将会打开一个终端窗口，打印两行文本：

```
hello world
This is a C program.
```



