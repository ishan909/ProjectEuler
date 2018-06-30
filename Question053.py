
# dictionary containing factorials
fact = {
    0: 1,
    1: 1
}


# computes the factorial of a number
def factorial(num):
    if num in fact.keys():
        # if factorial has already been computed, return the factorial from dictionary
        return fact[num]
    else:
        # compute the factorial and store it in the dictionary
        ans = num * factorial(num - 1)
        fact[num] = ans
        return ans


count = 0
for n in range(1, 101):
    for r in range(1, n + 1):
        if factorial(n) / factorial(r) / factorial(n - r) > 1000000:
            count += 1
print('Combinations over 1000000: ' + str(count))
