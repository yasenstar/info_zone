/*
使用三个用户定义的函数(包括main())，并生成如下输出：
Three blind mice
Three blind mice
See how they run
See how they run
其中一个函数要调用两次，每个函数生成相应的两行。
*/

#include <iostream>
void text1(void);
void text2(void);
using namespace std;

int main() {
    text1();
    text1();
    text2();
    text2();
    return 0;
}

void text1(void) {
    cout << "Three blind mice\n";
}

void text2(void) {
    cout << "See how they run\n";
}