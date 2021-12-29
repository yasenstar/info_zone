// converting built-in types to string

#include <sstream>
#include <string>
#include <iostream>

using namespace std;

int main() {
    int i = 10;
    long j = 1234567890;
    float f = 3.14f;
    double d = 2.71222222223;

    string myString;

    myString = getString<int>(i);
    cout << myString << endl;

    return 0;
}