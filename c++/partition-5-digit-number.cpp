//Name: Aimee Valladares
//Date of Last Debugging/Compiling: 1/22/2019
#include <iostream>
using namespace std;

int main()
{
    //Prompt user input
    short unsigned int variable;
    cout << "Enter a positive integer (Up to five digits): ";
    cin >> variable;

    //Extract and save individual digits
    int variable5 = variable % 10;
    variable /= 10;
    int variable4 = variable % 10;
    variable /= 10;
    int variable3 = variable % 10;
    variable /= 10;
    int variable2 = variable % 10;
    variable /= 10;
    int variable1 = variable % 10;
    variable /= 10;

    //Display digits
    cout << "1st digit: " << variable1 << endl << "2nd digit: " << variable2 << endl
        << "3rd digit: " << variable3 << endl << "4th digit: " << variable4 << endl
        << "5th digit: " << variable5 << endl;

    return 0;
}
