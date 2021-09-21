// strtype3.cpp -- more string class features
#include <iostream>
#include <string>       // make string class available
#include <cstring>      // C-style string library
int main(){
    using namespace std;
    char charr1[20];
    char charr2[20] = "jaguar";
    string str1;
    string str2 = "panther";

    // assignment for string objects and character arrays
    str1 = str2;        // copy str2 to str1
    strcpy(charr1, charr2);     // copy charr2 to charr1

    // appending for string objects and characters arrarys
    str1 += " paste";
    strcat(charr1, " juice");

    // finding the length of a string object and a C-style string
    int len1 = str1.size();
    int len2 = strlen(charr1);

    cout << "The string " << str1 << " contains " << len1 << " characters.\n";
    cout << "The string " << charr1 << " contains " << len2 << " characters.\n";
    return 0;
}