// ownfunc.cpp -- defining your own functions

#include <iostream>
void yasen(int);        // function prototype for yasen()

int main() {
    using namespace std;
    yasen(3);
    cout << "Pick an integer: ";
    int count;
    cin >> count;
    yasen(count);
    cout << "Done!" << endl;
    return 0;
}

void yasen(int n) {
    using namespace std;
    cout << "Yasen says touch your toes " << n << " times." << endl;
}