// init.cpp -- type changes on initiatiation
// date: 2020-10-19
#include <iostream>
int main() {
    using namespace std;
    cout.setf(ios_base::fixed, ios_base::floatfield);
    float tree = 3;
    int guess(3.9833);
    int debt = 7.2E12;
    cout << "tree = " << tree << endl;
    cout << "guess = " << guess << endl;
    cout << "debt = " << debt << endl;
    return 0;
}