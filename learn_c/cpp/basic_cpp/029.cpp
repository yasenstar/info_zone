#include <iostream>
using namespace std;
int main() {
    int i = 0, max;
    int sum = 0;
    cout << "please give maximum number: ";
    cin >> max;
    while (true) {
        i++;
        sum += i;
        if (i == max) break;
    }
    cout << "sum from 1 till max is: " << sum << "\n";
    return 0;
}