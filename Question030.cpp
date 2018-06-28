#include <iostream>
#include <vector>
#include <cmath>

std::vector<unsigned> get_digits_vector(unsigned n) {
    std::vector<unsigned> digits;
    while (n >= 1) {
        digits.push_back(n % 10);
        n /= 10;
    }
    return digits;
}

unsigned get_power_sum(unsigned n) {
    std::vector<unsigned> digits = get_digits_vector(n);
    unsigned power_sum = 0;
    for (unsigned i = 0; i < digits.size(); i++) {
        power_sum += pow(digits[i], 5.0);
    }
    return power_sum;
}

int main() {
    unsigned sum = 0;
    unsigned n = 2;
    while (n < UINT_MAX) {
        unsigned power_sum_n = get_power_sum(n);
        if (power_sum_n == n) {
            sum += get_power_sum(n);
            std::cout << "n: " << n << " sum: " << sum << std::endl;
        }
        n++;
    }
    return 0;
}
