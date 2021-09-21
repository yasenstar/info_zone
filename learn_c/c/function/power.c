#include <stdio.h>

int power(int m, int n);

/* test power function */
int main() {
	int i;
	for (i = 0; i < 10; ++i)
		printf("%d %d %d %d %d\n", i, power(2, i), power(3,i), power(4, i), power(5,i));
	return 0;
}
/* power function, used to calculate 底数的n次幂, in which n >= 0 */
int power(int base, int n)
{
	int i, p;
	p = 1;
	for (i = 1; i <= n; ++i)
		p = p * base;
	return p;
}