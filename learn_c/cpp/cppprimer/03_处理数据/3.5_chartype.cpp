// chartype.cpp -- the char type
// date: 2020-10-19
#include <iostream>
int main() {
    using namespace std;
    char ch;

    cout << "Please enter a char: " << endl;
    cin >> ch;
    cout << "hola! ";
    cout << "Thank you for the " << ch << " character." << endl;
    cout << &ch;    // why cannot diplay ch's memory address using pointer?
    return 0;
}