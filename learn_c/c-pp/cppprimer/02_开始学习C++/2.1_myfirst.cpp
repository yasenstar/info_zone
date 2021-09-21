// myfirst.cpp -- displays a message

#include <iostream>                             // a PREPROCESSOR directive
int main(void)                                  // function header, it's same using main() or mina(void), normally main() is enough
{                                               // start of function body
    using namespace std;                        // make definitions visible, this is c++98 standard
    cout << "Come up and C++ me some time.";    // message
    cout << endl;                               // start a new line
    cout << "You won't regret it!" << endl;     // more output
    cout << "What's next\n";
    cout << "Pluto is a dwarf planet.\n";
    cout << "Pluto is a dwarf planet." << endl;
    cout << "\n";
    cout << endl;
    // cin.get();
    return 0;                                   // terminate main()
}                                               // end of function body
