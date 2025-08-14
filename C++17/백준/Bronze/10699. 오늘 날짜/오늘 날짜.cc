#include <iostream>
#include <chrono>
#include <iomanip>

using namespace std;

int main() {
    auto now = chrono::system_clock::now();
    time_t t = chrono::system_clock::to_time_t(now);
    
    tm* tm = localtime(&t);

    cout << put_time(tm, "%Y-%m-%d") << endl;

    return 0;
}