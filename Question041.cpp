#include <iostream>
#include <cmath>

bool is_pandigital(long num) {
    int nums[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    int length = 0;
    while (num >= 1) {
        int trail = num % 10;
        if (trail == 0) {
            return false;
        }
        nums[trail]++;
        if (nums[trail] > 1) {
            return false;
        }
        num /= 10;
        length++;
    }
    for (int i = 1; i < length + 1; i++) {
        if (nums[i] != 1) {
            return false;
        }
    }
    return true;
}


// can be improved with Sieve of Eratosthenes algorithm
bool is_prime(long num) {
    if (num < 2) {
        return false;
    }
    for (long i = 2; i < sqrt(num) + 1; i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}


int main() {
    long biggest = 2143;
    for (long i = 2143; i < 1000000000; i += 2) {
        if (is_pandigital(i) && is_prime(i)) {
            biggest = i;
        }
    }
    std::cout << "biggest: " << biggest << std::endl;
    return 0;
}
