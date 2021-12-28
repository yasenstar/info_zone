#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;
int main() {
    long double sum, a;
    int i = 1;
    sum = 0;
    while (i <= 64) {
        a = pow(2, i-1);
        sum += a;
        i++;
    }
    cout << fixed;
    cout << setprecision(0);
    cout << "64个格子中的米粒总数是： " << sum << "\n";
    return 0;
}