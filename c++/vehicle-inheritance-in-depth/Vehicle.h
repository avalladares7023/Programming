#ifndef VEHICLE_H_INCLUDED
#define VEHICLE_H_INCLUDED
#include <string>
using namespace std;

class Vehicle
{
private: //data fields
    double speed;
    double weight;

public:
    //Constructors
    Vehicle(); //no-arg. constructor
    Vehicle(double speed, double weight); //std. constructor
    //get and set methods
    double getSpeed();
    void setSpeed(double speed);
    double getWeight();
    void setWeight(double weight);
    //functions
    void display(); //no return, no parameter, print name and current value of every property.
    void start(); //no return, print how a typical vehicle usually starts. For example, start with key and ignitor
    string toString();
};

#endif // VEHICLE_H_INCLUDED
