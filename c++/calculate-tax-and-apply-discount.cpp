//Name: Aimee Valladares
//Date of Last Debugging/Compiling: 1/22/2019
#include <iostream>
using namespace std;

int main()
{
    //Input variables
    int annualIncome;
    int age;
    double taxRate;
    double taxAmount;

    //Prompt user input
    cout << "Enter your annual income: " << annualIncome;
    cin >> annualIncome;
    cout << "Enter your age: " << age;
    cin >> age;
    //If the age entered is 60 or above then they are regarded
    //as a senior citizen and may be eligible for a discount

    //Determine the appropriate tax rate
    if (annualIncome <= 50000)
        taxRate = 0.0;
    else if (annualIncome >= 50000 && annualIncome <= 100000)
        taxRate = 0.07;
    else
        taxRate = 0.09;

    //Determine if eligible for the senior discount
    if (age >= 60 && taxRate !=0)
        taxRate = taxRate - 0.03;

    //Calculate the tax amount
    taxAmount = annualIncome * taxRate;
    taxRate = taxRate * 100;

    //Print Display
    cout << "Tax Amount: $" << taxAmount << endl;
    cout << "Tax Rate: " << taxRate << endl;
    if (age >= 60 && taxRate != 0)
        cout << "Senior Discount is being applied" << endl;
    else
        cout << "Senior Discount is not being applied" << endl;

    return 0;
}

