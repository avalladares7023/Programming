#include <iostream>
using namespace std;

class Animal
{
public:
    Animal()
    {
        cout << "constructor of Animal class" << endl;
    }
    eat()
    {
        cout << "eat() method of Animal class" << endl;
    }
    grow()
    {
        cout << "grow() method of Animal class" << endl;
    }
};

class Fish: public Animal
{
public:
    Fish()
    {
        cout << "constructor of Fish class" << endl;
    }
    eat()
    {
        cout << "eat() method of Fish class" << endl;
    }
};

class Mammal: public Animal
{
public:
    Mammal()
    {
        cout << "constructor of Mammal class" << endl;
    }
};

class Sardine: public Fish
{
public:
    Sardine()
    {
        cout << "constructor of Sardine class" << endl;
    }
    eat()
    {

    }
    grow()
    {
        cout << "grow() method of Sardine class" << endl;
    }
};
void display(Sardine& s1)
{
    s1.eat();
    s1.grow();
}

class Bass: public Fish
{
public:
    Bass()
    {
        cout << "constructor of Bass class" << endl;
    }

    eat()
    {
        cout << "eat() method of Bass class" << endl;
    }
    grow()
    {

    }
};
void display(Bass& b1)
{
    b1.eat();
    b1.grow();
}

class Cat: public Mammal
{
public:
    Cat()
    {
        cout << "constructor of Cat class" << endl;
    }
    eat()
    {
        cout << "eat() method of Cat class" << endl;
    }
    grow()
    {
        cout << "grow() method of Cat class" << endl;
    }
};

class Tiger: public Cat
{
public:
    Tiger()
    {
        cout << "constructor of Tiger class" << endl;
    }
    eat()
    {

    }
    grow()
    {

    }
};
void display(Tiger& t1)
{
    t1.eat();
    t1.grow();
}

class Lion: public Cat
{
public:
    Lion()
    {
        cout << "constructor of Lion class" << endl;
    }
    eat()
    {
        cout << "eat() method of Lion class" << endl;
    }
    grow()
    {

    }
};

void display(Lion& L1)
{
    L1.eat();
    L1.grow();
}

int main()
{
    Sardine s1;
    display(s1);
    cout << endl;
    Bass b1;
    display(b1);
    cout << endl;
    Tiger t1;
    display (t1);
    cout << endl;
    Lion L1;
    display(L1);
    cout << endl;
}
