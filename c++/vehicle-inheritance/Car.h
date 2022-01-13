#ifndef CAR_H_INCLUDED
#define CAR_H_INCLUDED
#include "Vehicle.h"
#include <string>

class Car: public Vehicle
{
public:
    Car(); //no-arg constructor
    Car(string color, string model);
    string getColor();
    void setColor(string color);
    string getModel();
    void setModel(string model);
    void display();
    void accelerate();
    string toString();

private:
    string color;
    string model;
};
#endif // CAR_H_INCLUDED
