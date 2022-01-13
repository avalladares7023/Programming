#include "Truck.h"
#include "Vehicle.h"
#include <iostream>
#include <string>

Truck::Truck()
{
    power = 25;
    num_wheels = 4;
}

Truck::Truck(double power, int num_wheel): Vehicle(speed, weight)
{
    speed = speed;
    weight = weight;
    power = power;
    num_wheel = num_wheel;
}

Truck::getPower()
{
    return power;
}

Truck::setPower()
{
    this-> power = power;
}

Truck::getNumOfWheels()
{
    return num_legs;
}

Truck::setNumOfWheels()
{
    this-> num_legs = num_legs;
}

Truck::display()
{
    cout << "Tacoma" << endl;
    cout << "The truck's current value of the truck is $50,000" << endl;
    return vehicle.display();
}

Truck::carry()
{
    cout << "The truck can carry up to 500 pounds" << endl;
}

Truck::toString()
{
    return "Truck";
}
