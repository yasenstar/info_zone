#include <iostream>
using namespace std;

int main()
{
    float annualSalary;
    cout << "Please enter your annual salary: ";
    cin >> annualSalary;
    float monthlySalary = annualSalary / 12;
    cout << "Your monthly salary is " << monthlySalary << "\n";
    cout << "In 10 years you will earn " << annualSalary * 10 << endl;

    char character = 'a';

    system("pause>0");
}
