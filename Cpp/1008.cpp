#include <iostream>

using namespace std;

int main() {
    double a, b, result;

    cin >> a >> b;

    result = a / b;

    cout << fixed;
    cout.precision(15);
    cout << result;
}