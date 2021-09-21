// exceed.cpp -- exceeding some integer limits
#include <iostream>
#define ZERO 0      // make ZERO symbol for 0 value
#include <climits>  // defines INT_MAX as largest int value

int main() {
    using namespace std;
    short sam = SHRT_MAX;       // initialize a variable to max value
    unsigned short sue = sam;   // okey if variable sam already defined

    cout << "Sam has " << sam << " dollars and Sue has " << sue << " dollars deposited." << endl;
    sam = sam + 1;
    sue = sue + 1;
    cout << "Sam has " << sam << " dollars and Sue has " << sue << " dollars deposited.\nPoor Sam!" << endl;
    
    sam = ZERO;
    sue = ZERO;
    cout << "Sam has " << sam << " dollars and Sue has " << sue << " dollars deposited." << endl;
    sam = sam - 1;
    sue = sue - 1;
    cout << "Sam has " << sam << " dollars and Sue has " << sue << " dollars deposited.\nLucky Sue!" << endl;
    return 0;
}