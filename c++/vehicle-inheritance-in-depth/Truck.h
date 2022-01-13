#ifndef TRUCK_H_INCLUDED
#define TRUCK_H_INCLUDED
#include "Vehicle.h"
#include <string>

class Truck: public Vehicle
{
private: //data fields
    double power;
    int num_wheel;

public:
    //constructors
    Truck(); //no-arg constructor
    Truck(double power, int num_wheel); //std. constructor
    Truck(double power, int num_wheel, double speed, double weight);//comprehensive constructor
    //get and set methods
    double getPower();
    void setPower(double power);
    int getNumOfWheels();
    void setNumOfWheels(int num_wheel);
    //functions
    void display();
    void carry();
    string toString();
};

#endif // TRUCK_H_INCLUDED
