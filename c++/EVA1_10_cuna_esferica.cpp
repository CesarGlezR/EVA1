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
    cout << "introduce R" << endl;
    double r;
    
    cin >> r;
    cout << "introduce n" << endl;
    double n;
    
    cin >> n;
    int p;
    
    p = 3.1416;
    double v;
    
    v = (double) 4 / 3 * ((double) p * pow(r, 3) / 360) * n;
    cout << "el volumen es " << endl;
    cout << v << endl;
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
