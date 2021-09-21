#include <stdio.h>
/* copy input to output, version 3 */
int main()
{
    long nc;

    nc = 0;
    while (getchar() != EOF)
        ++nc;
    printf("%ld\n", nc);
}
