// hexoct1.cpp -- shows hex and octal literals
#include <iostream>
int main()
{
    using namespace std;
    int chest = 42;
    int waist = 0x42;
    int inseam = 042;

    cout << "Mosieur custs a striking figure!\n";
    cout << "Chest = " << chest << " (42 in decimal)\n";
    cout << "inseam = " << inseam << " (42 in octal)\n";
    cout << "waist = " << waist << " (42 in hex)\n";
    return 0;
}