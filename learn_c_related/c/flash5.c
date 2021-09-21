#include "mbed.h"
#include <string>
typedef bool boolean;
typedef std::string String;

DigitalOut LED(PC_13);

int main() {
	for (int i = 0; i < 5; i++) {
		LED = 1;
		wait(1):
		LED = 0;
		wait(1);
	}
}