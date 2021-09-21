#include <QCoreApplication>

int main(int argc, char *argv[])
{
    QCoreApplication a(argc, argv);

    printf("hello world\n");

    printf("This is a C program.\n");

    return a.exec();
}
