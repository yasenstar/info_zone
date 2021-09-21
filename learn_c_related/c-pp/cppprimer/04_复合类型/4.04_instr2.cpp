// instr2.cpp -- reading more than one word with getline()
#include <iostream>
int main() {
    using namespace std;
    const int ArSize = 20;
    char name[ArSize];
    char dessert[ArSize];

    cout << "Enter your name:\n";
    cin.getline(name, ArSize);
    cout << "Enter your favorite dessert:\n";
    cin.getline(dessert, ArSize);
    cout << "I have some delicious " << dessert << " for you, " << name << ".\n";

    return 0;
}

// getline() 每次读取一行，通过换行符来确定行尾，但不保存换行符，存储时用空字符来替换换行符。