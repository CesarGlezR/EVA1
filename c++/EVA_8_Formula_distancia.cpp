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
    cout << "velocidad inicial" << endl;
    double rVI;
    
    cin >> rVI;
    cout << "velocidad final" << endl;
    double rVF;
    
    cin >> rVF;
    cout << "tiempo" << endl;
    double rT;
    
    cin >> rT;
    double rD;
    
    rD = (rVI + rVF) / 2 * rT;
    cout << "La distancia es ";
    cout << rD << endl;
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
