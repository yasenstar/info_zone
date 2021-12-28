// f_degree = c_degree / 5 * 9 + 32
// c_degree = (f_degree - 32) * 9 / 5

#include <iostream>

int main()
{
    using namespace std;

    float c_degree, f_degree;
    
    cout << "\n=== Convert c_degree to f_degree ===\n";
    cout << "\n";
    cout << "Please input tempreture in c_degree: ";
    cin >> c_degree;
    cout << "You input c_degree = " << c_degree << " degree\n";
    f_degree = c_degree / 5 * 9 + 32;
    cout << "The equivalent f_degree is " << f_degree << " degree\n";
    cout << "Have a nice day!\n";
    return 0;
}