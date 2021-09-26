The Java programming language, developed at Sun Microsystems under the guidance of Net luminaries James Gosling and Bill Joy, was designed to be a machine-independent programming language that is both safe enough to traverse networks and powerful enough to replace native executable code.

Java is both a compiled and an interpreted language.

_Encapsulations_ is thge concept of hiding data and behavior within a class; it's an important part of object-oriented design.

Sample code in C++:

```c++
// C++ code
class Finances {
    private:
        char creditCardNumber[16];
        ...
};

main() {
    Fiannces finances;

    // Forge a pointer to peek inside the class
    char *cardno = (char *)&finances;
    printf("Card Number = %.16s\n", cardno);
}
```

In this C++ drama, there're violating the encapsulation of the `Finances` class and pulls out some secret information.

This sort of shenanigan -- abusing an untyped pointer -- is not possilbe in Java.
