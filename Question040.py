# Problem 040
# Champernowne's constant

num = ""
for i in range(0, 1000000):
    num += str(i)
product = int(num[1]) * int(num[10]) * int(num[100]) * int(num[1000]) * int(num[10000]) * int(num[100000]) * int(num[1000000])
print(product)
