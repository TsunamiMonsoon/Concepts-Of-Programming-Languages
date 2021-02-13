// Created @Heather Willis on 1/17/2021.

#include <iostream>
using namespace std;

int main () {
    double base1, base2, height, area; // defining the variables

    cout << "Enter the number for the first base of the trapezoid.";
    cin >> base1; // grabbing the first num
    cout << "Enter the number for the second base of the trapezoid.";
    cin >> base2; // grabbing the second num
    cout << "Enter the height of the trapezoid.";
    cin >> height; // grabbing the third num

    area = .5 * (base1 + base2) * height; // trapezoid formula

    cout << "Area of the trapezoid is: " << area; // print the area of the trapezoid
    return 0;
}
