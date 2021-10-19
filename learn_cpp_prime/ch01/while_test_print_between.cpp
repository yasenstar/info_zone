#include <iostream>
using namespace std;

int main() {
    cout << "Please input two number (from and to): " << endl;
    int from, to;
    cin >> from >> to;
    from++;
    while (from < to) {
        cout << from << endl;
        ++from;
    }
    return 0;
}