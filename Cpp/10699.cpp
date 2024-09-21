#include <iostream>
#include <chrono>
#include <iomanip>

using namespace std;

int main() {
    auto now = chrono::system_clock::now(); // 현재 시간을 가져와 now에 저장
    time_t t = chrono::system_clock::to_time_t(now); // now를 time_t로 변환
    
    tm* tm = localtime(&t); // t(time_t) 값을 로컬 시간으로 변환하여 tm 구조체의 포인터를 얻음
                            // localtime 함수는 time_t 값을 사람이 읽을 수 있는 형식으로 변환
                            // &t(포인터)를 사용하는 이유: localtime 함수는 time_t 변수의 주소를 인자로 요구함

    cout << put_time(tm, "%Y-%m-%d") << endl;

    return 0;
}