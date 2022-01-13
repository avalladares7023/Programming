#include "Car.h"
#include "Vehicle.h"
#include <iostream>
#include <string>

//no-arg constructor
Car::Car()
{
    color = "Black";
    model = "Kia";
}

//std. constructor
Car::Car(string color, string model)
{
    //Initialize current class's properties
    setColor(color);
    setModel(model);
}

//comprehensive constructor
Car::Car(string color, string model, double speed, double weight)
{
    setColor(color);
    setModel(model);
    setSpeed(speed);
    setWeight(weight);
}

string Car::getColor()
{
    return color;
}

void Car::setColor(string color)
{
    this->color = color;
}

string Car::getModel()
{
    return model;
}

void Car::setModel(string model)
{
    this->model = model;
}

void Car::display()
{
    cout << "The color of this car is " << color << endl;
	cout << "The model of this car is " << model << endl;
}

void Car::accelerate()
{
    cout << "Acceleration occurs in less than 5 seconds" << endl;
}

string Car::toString()
{
    return "Car Object";
}
