//Name: Aimee Valladares
//Date of the last successful compiling/debugging: 2/23/2019
#include <iostream>
using namespace std;

//function prototype
void rShift(int& a1, int& a2, int& a3, int& a4, int& maximum, float& average)
{
    //Shift the integers
    int numShift[4] = {a1, a2, a3, a4};

    int n = numShift[4 - 1]; //Temporary holder (n4) arr[3]
    for (int i = 4 - 1; i > 0; i--)
    {
        numShift[i] = numShift[i - 1];
    }
    numShift[0] = n;
    a1 = numShift[2]; //a1 takes a2 value
    a2 = numShift[3]; //a2 takes a3 value
    a3 = numShift[4]; //a3 takes a4 value
    a4 = numShift[1]; //a4 takes a1 value

    //Find the maximum
    int test1, test2;
    if (a1 > a2)    //Find the max between the first 2 integers
        test1 = a1;
    else
        test1 = a2;

    if (a3 > a4)    //Find the max between the last 2 integers
        test2 = a3;
    else
        test2 = a4;

    if (test1 > test2) //After going through the first 2 if loops find the max between the remaining integer
        test1 = maximum;
    else
        test2 = maximum;

    //Calculate the Average
    average = (a1 + a2 + a3 + a4) / 4.0;
}

int main()
{
    //Declare variables
    int a1, a2, a3, a4;
    int maximum;
    float average;

    //Prompt user input
    cout << "Enter four integers: ";
    cin >> a1 >> a2 >> a3 >> a4;

    //Display results
    rShift(a1, a2, a3, a4, maximum, average);
    cout << a1 << " " << a2 << " " << a3 << " " << a4 << endl;
    cout << "The maximum is " << maximum << endl;
    cout << "The average is " << average << endl;
}
