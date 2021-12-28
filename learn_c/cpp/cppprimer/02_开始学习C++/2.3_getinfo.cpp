// getinfo.cpp -- intpu and output

#include <iostream>

int main()
{
    using namespace std;

    int carrots;

    cout << "How many carrots do you have?" << endl;
    cin >> carrots;
    cout << "You have " << carrots << " carrots!" << endl;
    cout << "Here are two more. " << endl;
    carrots += 2;
    cout << "Now you have " << carrots << " carrots!" << endl;
}