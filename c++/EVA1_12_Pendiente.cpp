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
    cout << "Introduce y1" << endl;
    double y1;
    
    cin >> y1;
    cout << "Introduce y2" << endl;
    int y2;
    
    cin >> y2;
    cout << "Introduce x1" << endl;
    double x1;
    
    cin >> x1;
    cout << "introduce x2" << endl;
    double x2;
    
    cin >> x2;
    double p;
    
    p = (y1 - y2) / (x1 - x2);
    cout << "La pendiente es ";
    cout << p << endl;
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
