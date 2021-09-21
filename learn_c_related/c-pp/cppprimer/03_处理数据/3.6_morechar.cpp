// morchar.cpp -- the char type and int type contrasted
// 2020-10-19

#include <iostream>
int main() {
    using namespace std;
    char ch = 'N';
    int i = ch;
    cout << "The ASCII code for " << ch << " is " << i << endl;

    cout << "Add one to the character code:" << endl;
    ch = ch + 1;
    i = ch;
    cout << "The ASCII code for " << ch << " is " << i << endl;

    // using the cout.put() member function to display a char
    cout << "Displaying char ch using cout.put(): ";
    cout.put(ch);
    cout << endl;

    // using cout.put() to display a char content
    cout.put('!');
    cout << endl << "Done." << endl;
    cout.put('\a');
    cout.put('\v');
    return 0;
}