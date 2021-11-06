#include <stdio.h>
main() {
    int s[6], min, i;
    printf("Please input 6 numbers:\n");
    for (i = 0; i < 6; i++) scanf("%d", &s[i]);
    min = s[0];
    for (i = 0; i < 6; i++) {
        if (min > s[i]) min = s[i];
    }
    printf ("min=%d\n", min);
}