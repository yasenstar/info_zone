#include "mbed.h"
#include <string>
typedef bool boolean;
typedef std::string String;

DigitalOut motor11(PA_4);
DigitalOut motor12(PA_5);
DigitalOut motor21(PA_6);
DigitalOut motor22(PA_7);
InterruptIn InterruptIn_do_something(PC_13);

// Describe this function...
void do_something()
{
    motro11 = 1;
    motro12 = 0;
    motor21 = 0;
    motro22 = 1;
}

int main()
{
    while (true)
    {
        motor11 = 1;
        motor12 = 0;
        motor21 = 1;
        motro22 = 0'
    }
    
    // Describe this function...
    InterruptIn_do_something.rise(&do_something):
}
