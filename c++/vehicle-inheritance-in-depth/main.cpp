#include <iostream>
#include <string>
#include "Vehicle.h"
#include "Car.h"
#include "Truck.h"
using namespace std;

int main()
{
    Vehicle vehicle;
    vehicle.setSpeed(220);
    vehicle.setWeight(210);
    cout << vehicle.toString() << endl;
    cout << "Vehicle speed: " << vehicle.getSpeed() << endl;
    cout << "Vehicle weight: " << vehicle.getWeight() << endl;
    cout << vehicle.display() << endl;
    cout << vehicle.start() << endl;

    Car car;
    car.setColor("Silver");
    car.setModel("Hyundai");
    car.setSpeed(200);
    car.setWeight(180);
    cout << car.toString() << endl;
    cout << "Car color: " << car.getColor() << endl;
    cout << "Car model: " << car.getModel() << endl;
    cout << "Car Speed: " << car.getSpeed() << endl;
    cout << "Car Weight: " << car.getWeight() << endl;
    cout << car.accelerate() << endl;
    cout << car.display() << endl;

    Truck truck;
    truck.setPower(50);
    truck.setNumOfWheels(4);
    truck.setSpeed(300);
    truck.setWeight(350);
    cout << truck.toString() << endl;
    cout << "Truck Power: " << truck.getPower() << endl;
    cout << "Number of Wheels: " << truck.getNumOfWheels() << endl;
    cout << "Truck Speed: " << truck.getSpeed() << endl;
    cout << "Truck Weight: " << truck.getWeight() << endl;
    cout << truck.carry() << endl;
    cout << truck.display() << endl;


    return 0;
}
