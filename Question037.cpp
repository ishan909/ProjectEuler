// Project Euler Question 37
// Truncatable primes

#import <iostream>
#import <cmath>
#import <sstream>
#import <string>

// returns if a number is prime
bool prime(unsigned n) {
    if (n == 1) {
        return false;
    }
    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

// Checks to see if the number n is a truncatable prime from left to right
// ie. n = 7, 97, 797, 3797
bool truncatable_prime_remove_LtR(unsigned n) {
    unsigned ending = 10;
    unsigned temp = n;
    while (temp >= 10) {
        // stores the last digits in the number
        int trail = n % ending;
        if (!prime(trail)) {
            return false;
        }
        ending *= 10;
        temp /= 10;
    }
    return true;
}

// Checks to see if the number n is a truncatable prime from right to left
// ie. n = 3797, 379, 37, 3
bool truncatable_prime_remove_RtL(unsigned n) {
    // truncate and check if is prime
    while (n >= 1) {
        if (!prime(n)) {
            return false;
        }
        // removes the last digit from the number
        n /= 10;
    }
    return true;
}

// Checks to see if the first digit of the number is not prime
// Used to reduce runtime
bool first_digit_valid(unsigned n) {
    std::ostringstream os;
    os << n;
    // convers the number to a string to easily access 1st value
    int first_digit = stoi(os.str().substr(0,1));
    // returns if the first number is not prime
    return first_digit != 1 && first_digit != 4 && first_digit != 6 && first_digit != 8 && first_digit != 9;
}

int main() {
    unsigned count = 0;
    unsigned truncatable_prime_sum = 0;
    unsigned n = 11; // lowest possible truncatable prime
    std::cout << "Truncatable Primes" << std::endl;
    while (count < 11) {
        if (first_digit_valid(n) && truncatable_prime_remove_RtL(n) && truncatable_prime_remove_LtR(n)) {
            std::cout << (count + 1) << ". " << n << std::endl;
            truncatable_prime_sum += n;
            count++;
        }
        n += 2;
    }
    std::cout << "The sum of the 11 truncatable primes is: " << truncatable_prime_sum << std::endl;
    return 0;
}
