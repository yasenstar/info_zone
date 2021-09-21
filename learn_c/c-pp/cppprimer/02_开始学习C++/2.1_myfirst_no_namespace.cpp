// myfirst.cpp -- displays a message

#include <iostream>                             // a PREPROCESSOR directive
int main(void)                                  // function header, it's same using main() or mina(void), normally main() is enough
{                                               // start of function body
    // using namespace std;                        // make definitions visible, this is c++98 standard
    std::cout << "Come up and C++ me some time.";    // message
    std::cout << std::endl;                               // start a new line
    std::cout << "You won't regret it!" << std::endl;     // more output
    // cin.get();
    return 0;                                   // terminate main()
}                                               // end of function body

// without namespace point to "std", need to use "std::" for all functions within STD, result is same