// structur.cpp -- a simple structure
#include <iostream>

struct inflatable       // structure declaration
{
    char name[20];
    float volume;
    double price;
};

/* struct basketball {
    char name_player[20];
    float wage;
    float height;
    float weight;
    float score_average;
}; */

int main() {
    using namespace std;
    inflatable guest =
    {
        "Glorious Gloria",  // name value
        1.88,               // volume value
        29.99               // price value
    };  // guest is a structure variable of type inflatable
    // it's initialized to the indicated values
    inflatable pal =
    {
        "Audacious Arthur",
        3.12,
        32.99
    };  // pal is a second variable of type inflatable
    // NOTE: some implementation require using static inflatable guest =

    cout << "Expand your guest list with " << guest.name;
    cout << " and " << pal.name << "!\n";

    cout << "You can have both for $" << guest.price + pal.price << "!\n";
    
    return 0;
}