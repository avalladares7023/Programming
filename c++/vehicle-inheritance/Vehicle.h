#ifndef VEHICLE_H_INCLUDED
#define VEHICLE_H_INCLUDED
#include <string>

class Vehicle
{
public:
    Vehicle(); //no-arg. constructor
    Vehicle(double speed, double weight); //std. constructor
    double getSpeed();
    void setSpeed(double speed);
    double getWeight();
    void setWeight(double weight);
    void display(); //no return, no parameter, print name and current value of every property.
    void start(); //no return, print how a typical vehicle usually starts. For example, start with key and ignitor
    string toString();

private:
    double speed;
    double weight;
};

#endif // VEHICLE_H_INCLUDED
