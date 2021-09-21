#include <stdio.h>
int main()
    {
        //max(int x, int y);
        int a, b, c;
        scanf("%d,%d", &a, &b);
        c = max(a,b);
        printf("max=%d\n",c);
        return 0;
    }