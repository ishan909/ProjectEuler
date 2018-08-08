#include <iostream>
#include <set>

// calculates the factorial of a number
long factorial(long n) {
    // This functin has been modificed to work best for single digit values of n, but will work
    // for any positive value for n (unless there is a long data type overflow)
    // Index:            0  1  2  3   4    5    6     7      8       9
    long predefined[] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
    if (n < 0) {
        return -1;
    } else if (n < 10) {
        return predefined[n];
    } else {
        return n * factorial(n - 1);
    }
}

// generates the next number using the factorial sum method
long generate_next(long n) {
    long sum = 0;
    while (n >= 1) {
        sum += factorial(n % 10);
        n /= 10;
    }
    return sum;
}

int main() {
    long sixty_count = 0;
    for (long i = 0; i < 1000000; i++) {
        std::set<long> seen;
        long list = i;
        int count = 0;
        while (true) {
            seen.insert(list);
            list = generate_next(list);
            count++;
            std::set<long>::iterator got = seen.find(list);
            if (got != seen.end()) {
                if (count == 60) {
                    sixty_count++;
                }
                break;
            }
        }
    }
    std::cout << sixty_count << " numbers under 1000000 result in a size 60 chain." << std::endl;
}
