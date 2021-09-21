#include "mbed.h"

DigitalOut led(PC_13);

int main()
{
    while (1==1)
    {
        led = 0;
        wait(1);
        led = 1;
        wait(1);
    }
}
