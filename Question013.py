
file = open("nums013.txt", "r")
sum = 0
for line in file:
    sum += long(line)
print(sum)
