// numstr.cpp -- following numnber input with line input
#include <iostream>
int main() {
    using namespace std;
    cout << "What year was your house built?\n";
    int year;
    (cin >> year).get();
    // cin.get();    // or cin.get(ch); used to read the "" and drop it before next cin.
    cout << "What is your house street address?\n";
    char address[80];
    cin.getline(address, 80);
    cout << "Year build: " << year << endl;
    cout << "Address: " << address << endl;
    cout << "Done\n";
    return 0;
}