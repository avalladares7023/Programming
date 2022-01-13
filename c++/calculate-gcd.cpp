//Name: Aimee Valladares
//Date of last successful debugging/compiling: 2/23/2019
#include <iostream>
using namespace std;

int gcd(int n1, int n2)
{
    if (n2 == 0)
        return n1;
    return gcd(n2, n1 % n2);
}

int main()
{
    int num1, num2;
    cout << "Enter two integers: ";
    cin >> num1 >> num2;
    cout << "The GCD is " << gcd(num1, num2);
}
