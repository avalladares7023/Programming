#include "Vehicle.h"
#include <iostream>
#include <string>

Vehicle::Vehicle()
{
    speed = 0;
    weigth = 400;
}

Vehicle::Vehicle(double speed, double weight)
{
    speed = speed;
    weight = weight;
}

Vehicle::getSpeed()
{
    return speed;
}

Vehicle::setSpeed(double speed)
{
    this->speed = speed;
}

Vehicle::getWeight()
{
    return weight;
}

Vehicle::setWeight()
{
    this->weight = weight;
}

Vehicle::display()
{
    cout << "This vehicle performs like a car or truck" << endl;
    cout << "This vehicle's current value is at least $15,000" << endl;
}

Vehicle::start()
{
    cout << "Insert your key and turn to start the ignition" << endl;
}

string Vehicle::toString()
{
    return "Vehicle";
}
