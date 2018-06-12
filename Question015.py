
# Question 15s
# formula: (2n)! / (n! * n!)


def factorial(n):
    if n <= 1:
        return 1
    return n * factorial(n - 1)


size = 20
temp = factorial(size)
print(factorial(2 * size) / temp / temp)
