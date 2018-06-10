

# returns an array of how many times each digit is seen in the input num
def digits(num):
    base_nums = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    while num >= 1:
        dig = num % 10
        base_nums[dig] += 1
        num /= 10
    return base_nums


found = False
i = 1
while not found:
    target = digits(i)
    i2 = i * 2
    if target != digits(i2):
        i += 1
        continue
    i3 = i * 3
    if target != digits(i3):
        i += 1
        continue
    i4 = i * 4
    if target != digits(i4):
        i += 1
        continue
    i5 = i * 5
    if target != digits(i5):
        i += 1
        continue
    i6 = i * 6
    if target != digits(i6):
        i += 1
        continue

    # At this point, we must have an i value that satisfies the conditions
    found = True
print(i)
