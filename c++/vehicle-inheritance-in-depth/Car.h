#ifndef CAR_H_INCLUDED
#define CAR_H_INCLUDED
#include "Vehicle.h"
#include <string>

class Car: public Vehicle
{
private: //data fields
    string color;
    string model;

public:
    //constructors
    Car(); //no-arg constructor
    Car(string color, string model); //std. constructor
    Car(string color, string model, double speed, double weight); //comprehensive constructor
    //get and set methods
    string getColor();
    void setColor(string color);
    string getModel();
    void setModel(string model);
    //functions
    void display();
    void accelerate();
    string toString();
};
#endif // CAR_H_INCLUDED
