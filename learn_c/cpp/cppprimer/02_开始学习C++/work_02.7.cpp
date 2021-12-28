// 用户输入小时数和分钟数，在main()函数中，将这两个值传递给一个void函数，然后显示这两个值

#include <iostream>
void time_display(int hr, int min);

int main() {
    using namespace std;
    int hour, minute;
    cout << "Enter the number of hours: ";
    cin >> hour;
    cout << "Enter the number of minutes: ";
    cin >> minute;
    time_display(hour, minute);
    return 0;
}

void time_display(int hr, int min) {
    using namespace std;
    cout << "Time: " << hr << ":" << min << endl;
}