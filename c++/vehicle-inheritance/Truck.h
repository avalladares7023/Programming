#ifndef TRUCK_H_INCLUDED
#define TRUCK_H_INCLUDED
#include "Vehicle.h"
#include <string>

class Truck: public Vehicle
{
public:
    Truck(); //no-arg constructor
    Truck(double power, int num_wheel); //std. constructor
    double getPower();
    void setPower(double power);
    double getNumOfWheels;
    void setNumOfWheels;
    void display();
    void carry();
    string toString();

private:
    double power;
    int num_wheel;
};

#endif // TRUCK_H_INCLUDED
