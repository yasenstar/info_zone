// 请用户输入一个以long为单位的距离，然后将其转换为码
// Formula: 1 long = 220 ma

#include <iostream>
int main() {
    using namespace std;
    double dist_in_long, dist_in_ma;
    cout << "Please input a distance in LONG: ";
    cin >> dist_in_long;
    dist_in_ma = 220 * dist_in_long;
    cout << "This distance equals " << dist_in_ma << " MA\n";
    return 0;
}