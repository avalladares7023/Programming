#include <iostream>
using namespace std;

//Aimee Valladares
//3/19/19
class Alligator
{
public:
    double weight = 50;
    int num_legs = 4;
    double age = 1;

    Alligator() //no-arg
    {
        double weight;
        int num_legs;
        double age;
    }

    Alligator(double newWeight, int numLegs, double newAge) //std.
    {
        weight = newWeight;
        num_legs = numLegs;
        age = newAge;
    }

    void toPrint()
    {
        cout << "The current alligator's weight is " << weight << endl;
        cout << "The current alligator has " << num_legs << " legs" << endl;
        cout << "The current alligator's age is " << age << endl;
    }

    void swim()
    {
        if (num_legs < 4)
            cout << "The current alligator can only swim short distances" << endl;
        else
            cout << "The current alligator is chill" << endl;
    }

    int main()
    {
        Alligator gator1; //no-arg object
        Alligator gator2; //std object

        //Call no-arg
        gator1.toPrint();
        gator1.swim();

        //User input
        cout << "Enter current alligator weight: ";
        cin >> weight;
        cout << "Enter number of legs for current alligator: ";
        cin >> num_legs;
        cout << "Enter current age of alligator: ";
        cin >> age;
        cout << endl;

        //Call std
        gator2.toPrint();
        gator2.swim();

        return 0;
    }
};
