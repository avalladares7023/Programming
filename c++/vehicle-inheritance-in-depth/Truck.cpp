#include "Truck.h"
#include "Vehicle.h"
#include <iostream>
#include <string>
//no-arg constructor
Truck::Truck()
{
    power = 25;
    num_wheel = 4;
}

//std. constructor
Truck::Truck(double power, int num_wheel)
{
    setPower(power);
    setNumOfWheels(num_wheel);
}

//comprehensive constructor
Truck::Truck(double power, int num_wheel, double speed, double weight)//: VehicleObject(speed, weight)
{
	setPower(power);
	setNumOfWheels(num_wheel);
	setSpeed(speed);
	setWeight(weight);
}

double Truck::getPower()
{
    return power;
}

void Truck::setPower(double power)
{
    this-> power = (power >= 0) ? power : 0;
}

int Truck::getNumOfWheels()
{
    return num_wheel;
}

void Truck::setNumOfWheels(int num_wheel)
{
    this-> num_wheel = (num_wheel >= 0) ? num_wheel : 0;
}

void Truck::display()
{
    cout << "This truck's horsepower is " << power << endl;
	cout << "The number of wheels this truck has is " << num_wheel << endl;
}

void Truck::carry()
{
    cout << "The truck can carry up to 500 pounds" << endl;
}

string Truck::toString()
{
    return "Truck Object";
}
