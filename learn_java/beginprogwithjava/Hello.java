public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

/*
got following error message when first time executing:

cd "/home/yasen/GitHub/learn_java/beginprogwithjava/" && javac hello.java && java hello
hello.java:1: error: class Hello is public, should be declared in a file named Hello.java
public class Hello {
       ^
1 error

checked the knowledge base from web, found the problem is I created file name as "hello.java",
when you name one class name, here I use "Hello", the case different "h" to "H" cause the problem.

After I changed the file name to "Hello.java", problem solved.
*/