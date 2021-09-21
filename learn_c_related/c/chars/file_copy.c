#include <stdio.h>
/* ½«ÊäÈë¸´ÖÆ to output, version 1 */
main()
{
    int c;

    c = getchar();
    while (c != EOF) {
        putchar(c);
        c = getchar();
    }
}
