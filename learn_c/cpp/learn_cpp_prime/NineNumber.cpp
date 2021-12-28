#include <iostream>
#include <algorithm>
using namespace std;

int main() {

    int x, y, z;
    int d[9] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    do {
        x = d[0] * 100 + d[1] * 10 + d[2];
        y = d[3] * 100 + d[4] * 10 + d[5];
        z = d[6] * 100 + d[7] * 10 + d[8];
        if ( y == x * 2 && z == x * 3) {
            cout<<x<<y<<z<<endl;
        }
    } while (next_permutation(d, d+9)); // STL中的函数，得到下一个排列

}

