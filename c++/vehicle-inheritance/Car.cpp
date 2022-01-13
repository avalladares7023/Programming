#include "Car.h"
#include "Vehicle.h"
#include <iostream>
#include <string>

Car::Car()
{
    color = "Black";
    model = "Kia";
}

Car::Car(string color, string model, double speed, double weight): Vehicle(speed, weight)
{
    //Initialize current class's properties
    speed = speed;
    weight = weight;
    color = color;
    model = model;
}

Car::getColor()
{
    return color;
}

Car::setColor(string color)
{
    this->color = color;
}

Car::getModel()
{
    return model;
}

Car::setModel()
{
    this->model = model;
}

Car::display()
{
    cout << "Rio" << endl;
    cout << "This car's current value is between $10,000 - $30,000" << endl;
    return vehicle.display();
}

Car::accelerate()
{
    cout << "Acceleration occurs in less than 5 seconds" << endl;
}

Car::toString()
{
    return "Car";
}
