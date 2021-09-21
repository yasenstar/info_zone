#include <stdio.h>
/* 当fahr= 0, 10, ..., 300时，分别打印华氏温度和摄氏温度对照表 */
int main() {

    int fahr, celsius;
    int lower, upper, step;

    lower = 0;
    upper = 300;
    step = 20;

    fahr = lower;
    printf ("fahr\tcelsius\n");
    while (fahr <= upper) {
    	celsius = 5 * ( fahr -32 ) / 9;
    	printf ("%d\t%d\n", fahr, celsius);
    	fahr = fahr + step; 
    }
}