#include <iostream>

using namespace std;

int main() {
    int a;
    string str = "*";
    string result = "";
    cin >> a;

    for (int i = 1; i <= a; i++) {
        result += str;
        cout << result << "\n";
    }
}