// 输入一个年龄，然后显示该年龄包含多少个月

#include <iostream>
int year_to_month(int yr);

int main() {
    using namespace std;
    int age;
    cout << "Please input your age: ";
    cin >> age;
    if (age <= 0 || age >= 151) {
        cout << "invalid age!\n";
        return 0;
    }
    else {
        cout << "Your age equals to " << year_to_month(age) << " months\n";
        return 0;
    }
}

int year_to_month(int yr) {
    return 12 * yr;
}