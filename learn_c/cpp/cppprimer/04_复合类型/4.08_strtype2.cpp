// string type 2 -- assigning, adding and appending of string
// 2020-10-21
#include <iostream>
#include <string>
int main() {
    using namespace std;
    string s1 = "penguin";
    string s2, s3;
    cout << "Initial: s1: " << s1 << ", s2: " << s2 << ", s3: " << s3 << endl;

    cout << "\nYou can assign one string object to another: s2 = s1\n";
    s2 = s1;
    cout << "Initial: s1: " << s1 << ", s2: " << s2 << ", s3: " << s3 << endl;

    cout << "\nYou can assign a C-style string to a string object.\n";
    cout << "s2 = \"buzzard\"\n";
    s2 = "buzzard";
    cout << "Initial: s1: " << s1 << ", s2: " << s2 << ", s3: " << s3 << endl;

    cout << "\nYou can concatenate strings: s3 = s1 + \" \" + s2\n";
    s3 = s1 + " " + s2;
    cout << "Initial: s1: " << s1 << ", s2: " << s2 << ", s3: " << s3 << endl;

    cout << "\nYou can append string.\n";
    s1 += s2;
    s3 += s1;
    cout << "Initial: s1: " << s1 << ", s2: " << s2 << ", s3: " << s3 << endl;
    s2 += " for a day";
    cout << "Initial: s1: " << s1 << ", s2: " << s2 << ", s3: " << s3 << endl;
    
    return 0;
}