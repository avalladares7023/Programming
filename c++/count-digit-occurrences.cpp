#include <iostream>
using namespace std;

const int SIZE_OF_ARRAY = 10;
void createArray (const int []);
void countDigits(const int []);
void displayDigits(const int []);

int main()
{
    //Prompt user input
    cout << "Enter a positive integer: ";
    int num;
    cin >> num;

    const int size[10] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    //Single out the current last digit
    while (num > 0)
    {
        int num6 = num % 10;
        num /= 10;
        int num5 = num % 10;
        num /= 10;
        int num4 = num % 10;
        num /= 10;
        int num3 = num % 10;
        num /= 10;
        int num2 = num % 10;
        num /= 10;
        int num1 = num % 10;
        num /= 10;
    }
    //Count the occurrences of each digit
    int counts[SIZE_OF_ARRAY];

    //Count the occurrences of each digit
    countDigits(ints, counts);

    //Display counts
    cout << "\nThe occurrences of each letter are: " << endl;
    displayDigits(counts);

    return 0;
}

void countDigits(const int ints[], int counts[])
{
    //Initialize the array
    for (int i = 0; i < SIZE_OF_ARRAY; i++)
        counts[i] = 0;

    //For each digit in the array count it
    int num = 9;
    for (int i = 0; i < num; i++)
        counts[ints[i] - '0'] ++;
}

//Display counts
void displayDigits(const int counts[])
{
    for (int i = 0; i < SIZE_OF_ARRAY; i++)
    {
        if ((i + 1) % 10 == 0)
            cout << counts[i] << " " << static_cast<int>(i + '0') << endl;
        else
            cout << counts[i] << " " << static_cast<int>(i + '0') << " ";
    }
}
