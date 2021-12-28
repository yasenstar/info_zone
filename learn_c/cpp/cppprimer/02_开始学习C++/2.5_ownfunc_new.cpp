// ownfunc.cpp -- defining your own functions

// put "using" out of the functions

#include <iostream>
using namespace std;
void yasen(int);        // function prototype for yasen()

int main() {
    yasen(3);
    cout << "Pick an integer: ";
    int count;
    cin >> count;
    yasen(count);
    cout << "Done!" << endl;
    return 0;
}

void yasen(int n) {
    cout << "Yasen says touch your toes " << n << " times." << endl;
}