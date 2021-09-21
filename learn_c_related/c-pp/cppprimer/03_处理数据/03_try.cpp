#include <iostream>
int main() {
    using namespace std;
    int x = 5;
    int y = x + 2;
    int z = x + y * 2;
    cout << "x\ty\tz\t" << endl;
    cout << x << "\t" << y << "\t" << z << endl;
    x = 10;
    y = x + 5;
    cout << x << "\t" << y << "\t" << z << endl;
    return 0;
}