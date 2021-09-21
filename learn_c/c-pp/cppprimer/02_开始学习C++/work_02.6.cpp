// 调用一个用户定义的函数（以光年值为参数，并返回对应天文单位的值）
// 天文单位是从地球到太阳的平均距离（约150000000公里或93000000英里）
// 光年是光一年走的距离（约10万亿公里或6万亿英里）
// 除太阳外，最近的恒星大约离地球4.2光年。
// 注意：使用double类型，转换公式为：1光年=63240天文单位

#include <iostream>
double lightyear_to_astrounit(double ly);
using namespace std;

int main() {
    double light_year, astro_unit;
    cout << "Please enter the number of light years: ";
    cin >> light_year;
    cout << light_year << " light years = " << lightyear_to_astrounit(light_year) << " astronomical units.\n";
    return 0;
}

double lightyear_to_astrounit(double ly) {
    return 63240 * ly;
}

// Date: 2020-10-17