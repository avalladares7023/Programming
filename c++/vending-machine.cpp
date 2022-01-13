//Name: Aimee Valladares
//Date of Successful Debug: 4/24/2019
#include <iostream>
#include <map>
using namespace std;

enum stypes
{
    Sprite =1,
    Pepsi =2,
    CocaCola=3,
    Brisk=4,
    Gatorade =5
};

class VendingMachine
{
private:
    int coinAmount;
    map <int, int> sodaType;
    map <int, int> item_count;

public:
    VendingMachine();
    double getCoinAmount();
    void setCoinAmount(int amount);
    map <int, int> getSodaType();
    map <int, int> maxItemCount();
    void showItems();
    void displayError(string);
    ~VendingMachine();
};

VendingMachine::VendingMachine()
{
    sodaType[1] = 5; //[1] is item selection and 5 is the item cost
    sodaType[2] = 5;
    sodaType[3] = 6;
    sodaType[4] = 6;
    sodaType[5] = 8;

    item_count[1] = 15;
    item_count[2] = 15;
    item_count[3] = 15;
    item_count[4] = 15;
    item_count[5] = 15;

    coinAmount = 0.0;
}

map <int, int> VendingMachine::maxItemCount()
{
    return item_count;
}

map <int, int> VendingMachine::getSodaType()
{
    return sodaType;
}

void VendingMachine::showItems()
{
    cout << "Types of Soda:" << endl;
    cout << "1: Sprite          -> $1.25" << endl;
    cout << "2: Pepsi           -> $1.25" << endl;
    cout << "3: Coca-Cola       -> $1.50" << endl;
    cout << "4  Brisk Iced Tea  -> $1.50" << endl;
    cout << "5: Gatorade        -> $2.00" << endl;
}

double VendingMachine::getCoinAmount()
{
    return coinAmount;
}

void VendingMachine::setCoinAmount(int amount)
{
    coinAmount += amount;
}

void VendingMachine::displayError(string message)
{
    cout << "Error Message" << message << endl;
}

VendingMachine::~VendingMachine()
{

}

class Drink: public VendingMachine //subclass
{
private:
    int item;
    int price;
    map <int, int> item_count;
    map <int, int> type;

public:
    Drink();
    void displayCoinAmount();
    bool inputQuarter();
    void selectionPad();
    void addCoins();
    void transactionStatus(bool);
};

Drink::Drink()
{

}

void Drink::addCoins()
{
    cout << "\nInput Coins (Only Quarters are Accepted): " << endl;
    cin >> price;
}

void Drink::displayCoinAmount()
{
    cout << "Total Coin Amount:" << getCoinAmount() << endl;
}

void Drink::transactionStatus(bool status)
{
    if (status)
    {
        cout << "Drink is Dispatched...." << endl;

        if (item == 1)
        {
            cout << "Taken Item: Sprite" << endl;
        }
        else if (item == 2)
        {
            cout << "Taken Item: Pepsi" << endl;
        }
        else if (item == 3)
        {
            cout << "Taken Item: Coca-Cola" << endl;
        }
        else if (item == 4)
        {
            cout << "Taken Item: Brisk Iced Tea" << endl;
        }
        else if (item == 5)
        {
            cout << "Taken Item: Gatorade" << endl;
        }

        cout << "Current Balance Amount: " << (price - type[item]) << endl;
        cout << "Remaining Items for Sale: " << endl;
        cout << "Sprite         -> " << item_count[1] << endl;
        cout << "Pepsi          -> " << item_count[2] << endl;
        cout << "Coca-Cola      -> " << item_count[3] << endl;
        cout << "Brisk Iced Tea -> " << item_count[4] << endl;
        cout << "Gatorade       -> " << item_count[5] << endl;
    }
}

bool Drink::inputQuarter()
{
    if(item_count[item] == 0)
        return false;
    --item_count[item];
    setCoinAmount(price);
        return true;
}

void Drink::selectionPad()
{
    type = getSodaType();
    item_count = maxItemCount();
    cout << Sprite << "" << type[2] << endl;
    addCoins();
    cout << endl;
    cout << "Select Item: " << endl;
    cin >> item;
    bool status;
    for (int i = 1; i < 6; i++)
    {
        if (i == item)
        {
            if(price < type[item])
            {
                displayError("Insufficient Funds....");
            }
            else if (item_count[item] == 0)
            {
                displayError("Item Out of Stock....");
            }
            else
            {
                status = inputQuarter();
                transactionStatus(status);
            }
        }
    }
}

int main()
{
    Drink soda;
    soda.showItems();
    soda.selectionPad();
}
