// bondini.cpp -- using escape sequences
// 2020-10-19
#include <iostream>
int main() {
    using namespace std;
/*  
    cout << "\aOperation \"HyperHype\" is now activated!\n";
    cout << "Enter your agent code:___________\b\b\b\b\b\b\b\b\b";
    long code;
    cin >> code;
    cout << "\007You entered: " << code << "...\n";
    cout << "\aCode verified! Proceed with Plan Z3!\n"; 
*/
    cout << "Let them eat g\u00E2teau. \n";
    cout << "\uFA02\n";
    cout << "\u1FA0\n";
    cout << "\u1F91\n";
    cout << "\uF919\n";
    return 0;
}