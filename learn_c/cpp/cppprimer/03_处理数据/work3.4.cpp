// 输入秒数，输出分离的天、小时、分钟和秒
// 使用符号常量来表示固定的数量

#include <iostream>
int main() {
    using namespace std;
    const int SECOND_PER_DAY = 24 * 60 * 60;
    const int SECOND_PER_HOUR = 60 * 60;
    const int SECOND_PER_MINUTE = 60;

    long long input_seconds, days, hours, minutes, seconds;

    cout << "Enter the number of seconds: ";
    cin >> input_seconds;

    days = input_seconds / SECOND_PER_DAY;
    hours = input_seconds % SECOND_PER_DAY / SECOND_PER_HOUR;
    minutes = input_seconds % SECOND_PER_HOUR / SECOND_PER_MINUTE;
    seconds = input_seconds % SECOND_PER_MINUTE;

    cout << input_seconds << " seconds = " << days << " days, " << hours 
         << " hours, " << minutes << " minutes, " << seconds << " seconds.";

    return 0;
}