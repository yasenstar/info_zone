#include <stdio.h>
/* copy input to output, version 2 */
int main()
{
    int c;

    while ((c = getchar()) != EOF) {
        putchar(c);
        printf(getchar()!=EOF);
    }
}
