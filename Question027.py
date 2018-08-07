import math


def is_prime(num):
    if num <= 1:
        return False
    if num % 2 == 0 and n > 2:
        return False
    for i in range(3, int(math.sqrt(num)) + 1, 2):
        if num % i == 0:
            return False
    return True


maximum = 0
max_product = 0
for a in range(-999, 1000):
    for b in range(-999, 1000):
        n = 1
        while is_prime(n * n + a * n + b):
            n += 1
            maximum = max(maximum, n)
        if n == maximum:
            max_product = a * b
print(max_product)
