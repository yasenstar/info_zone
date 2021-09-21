#include <stdio.h>
/* 当fahr= 0, 10, ..., 300时，分别打印华氏温度和摄氏温度对照表 */
int main() {

    float fahr, celsius;
    int lower, upper, step;

    lower = 0;
    upper = 300;
    step = 15;

    fahr = lower;
    printf ("fahr\tcelsius\n");
    while (fahr <= upper) {
    	celsius = 5.0 / 9.0 * ( fahr - 32.0 );
    	printf ("%3.0f %6.1f\n", fahr, celsius);
    	fahr = fahr + step; 
    }
}