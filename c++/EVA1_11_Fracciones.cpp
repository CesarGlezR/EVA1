#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

// Headers
string toString (double);
int toInt (string);
double toDouble (string);

int main() {
    cout << "introduce numerador" << endl;
    double rNum;
    
    cin >> rNum;
    cout << "introduce denominador" << endl;
    double rDen;
    
    cin >> rDen;
    cout << "introduce numerador 2" << endl;
    double rNum2;
    
    cin >> rNum2;
    cout << "Introduce denominador 2" << endl;
    double rDen2;
    
    cin >> rDen2;
    double rSum;
    
    rSum = rNum / rDen + rNum2 / rDen2;
    cout << "El resultado de la suma es ";
    cout << rSum << endl;
    double rRest;
    
    rRest = rNum / rDen - rNum2 / rDen2;
    cout << "El resulatdo de la resta es ";
    cout << rRest << endl;
    double rDiv;
    
    rDiv = rNum / rDen / (rNum2 / rDen2);
    cout << "El resultado de la division es ";
    cout << rDiv << endl;
    double rMult;
    
    rMult = rNum / rDen * (rNum2 / rDen2);
    cout << "El resultado de la multiplicacion es ";
    cout << rMult << endl;
    return 0;
}

// The following implements type conversion functions.
string toString (double value) { //int also
    stringstream temp;
    temp << value;
    return temp.str();
}

int toInt (string text) {
    return atoi(text.c_str());
}

double toDouble (string text) {
    return atof(text.c_str());
}
