#include "mbed.h"

DigitalOut led(PC_13);
InterruptIn IIn(PB_5):

void callback()
{
    led = !led;
}

int main()
{
    IIn.rise(callback);
    while (1==1);
}
