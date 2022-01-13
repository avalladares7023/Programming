#include "Vehicle.h"
#include <iostream>
#include <string>

//no-arg constructor
Vehicle::Vehicle()
{
    speed = 1;
    weight = 400;
}

//std. constructor
Vehicle::Vehicle(double speed, double weight)
{
    this->speed = speed;
    this->weight = weight;
}

//comprehensive constructor
double Vehicle::getSpeed()
{
    return speed;
}

void Vehicle::setSpeed(double speed)
{
    this->speed = (speed >= 0) ? speed : 0;
}

double Vehicle::getWeight()
{
    return weight;
}

void Vehicle::setWeight(double weight)
{
    this->weight = (weight >= 0) ? weight : 0;
}

void Vehicle::display()
{
    //Print name and current value of every property.
    cout << "Speed is " << speed << endl;
	cout << "Weight is " << weight << endl;
}

void Vehicle::start()
{
    cout << "Insert your key and turn to start the ignition" << endl;
}

string Vehicle::toString()
{
    return "Vehicle Object";
}
