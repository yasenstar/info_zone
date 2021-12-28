#include <iostream>
#include <string>
using namespace std;
int main() {
    string name1, name2;
    cout << "Please input first English name: ";
    cin >> name1;
    cout << "Please input second English name: ";
    cin >> name2;
    cout << "Sorting result is ";
    if (name1 < name2)
        cout << name1 << ", " << name2;
    else
        cout << name2 << ", " << name1;
    return 0;
}