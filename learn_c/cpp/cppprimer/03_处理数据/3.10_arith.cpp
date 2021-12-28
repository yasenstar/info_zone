// arith.cpp -- some C++ arithmetic
// date: 2020-10-19
#include <iostream>
int main()
{
    using namespace std;
    float hats, heads;

    cout.setf(ios_base::fixed, ios_base::floatfield);   // fixed-point

    cout << "Enter a number: "; cin >> hats;
    cout << "Enter another number: "; cin >> heads;

    cout << "hats = " << hats << ", heads = " << heads << endl;

    cout << "hats + heads =" << hats + heads << endl;
    cout << "hats - heads =" << hats - heads << endl;
    cout << "hats * heads =" << hats * heads << endl;
    cout << "hats / heads =" << hats / heads << endl;
}