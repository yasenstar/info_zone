#include "mbed.h"

DigitalOut led(PC_13);

int main()
{
  for (int i = 1; i <= 150; i++)
  {
    led = 0;
    wait(1);
    led = 1;
    wait(1);
  }
}
