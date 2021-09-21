// floatnum.cpp -- floating-point types
// date: 2020-10-198
#include <iostream>
int main() {
    using namespace std;
    cout.setf(ios_base::fixed, ios_base::floatfield);
    float tub = 10.0 / 3.0;
    double mint = 10.0 / 3.0;
    const float million = 1.0E6;

    cout << "tub= " << tub;
    cout << ", a million tubs = " << million * tub;
    cout << ", \nand ten million tubs = " << 10 * million * tub << endl;
    
    cout << "mint = " << mint << " and a million mints = " << million * mint << endl;
    return 0;
}