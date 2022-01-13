#include <iostream>
#include "Vehicle.h"
#include "Car.h"
#include "Truck.h"
using namespace std;

int main()
{
    Vehicle vehicle;
    vehicle.setSpeed(120);
    vehicle.setWeight(150);
    cout << vehicle.toString() << endl
        << "Vehicle speed: " << vehicle.getSpeed() << endl
        << "Vehicle weight: " << vehicle.getWeight() << endl
        << vehicle.start() << vehicle.display() << endl;

    Car car;
    car.setColor("Silver");
    car.setModel("Hyundai");
    cout << car.toString() << endl
        << "Car color: " << car.getColor() << endl
        << "Car model: " << car.getModel() << endl
        << car.accelerate() << car.display() << endl;

    Truck truck;
    truck.setPower(50);
    truck.setNumOfWheels(4);
    cout << truck.toString() << endl;
        << "Truck Power: " << truck.getPower() << endl
        << "Number of Truck wheels: " << truck.getNumOfWheels() << endl
        << truck.carry() << truck.display() << endl;


    return 0;
}
