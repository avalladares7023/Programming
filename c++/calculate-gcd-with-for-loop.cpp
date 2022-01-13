//Name: Aimee Valladares
//Date of Last Debugging/Compiling: 1/30/2019
#include <iostream>
using namespace std;

int main()
{
    //Input variables
    int variable1;
    int variable2;
    int gcd;

    //Prompt user input for first variable
    while (variable1< 0)
    {
        cout << "Enter a positive integer: ";
        cin >> variable1;
    }

    //Prompt user input for second variable
    while (variable2 < 0)
    {
        cout << "Enter another positive integer: ";
        cin >> variable2;
    }

    //for loop to determine the GCD of the two input integers
    for (int i = 1; i <= variable1 && i <= variable2; i++)
    {
        if (variable1 % i == 0 && variable2 % 1 == 0)
            gcd = i;
    }

    //Print results
    cout << endl << "Number 1: " << variable1 << endl << "Number 2: " << variable2 << endl;
    cout << "Greatest Common Divisor (GCD): " << gcd << endl;

    return 0;
}
