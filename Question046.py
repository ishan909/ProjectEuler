import math


# returns if a number is prime
def prime(num):
    if num <= 1:
        return False
    if num % 2 == 0 and n > 2:
        return False
    for i in range(3, int(math.sqrt(num)) + 1, 2):
        if num % i == 0:
            return False
    return True


n = 9
while True:
    if not prime(n):
        # see if there is a prime number + 2 * num^2 that equals n
        m = 1
        while m < n:
            if prime(n - (2 * m * m)):
                break
            m += 1
        if m == n:
            print(n)
            break
    n += 2
