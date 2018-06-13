# returns the number of first days of the month which are a Sunday in the 20th century
from datetime import date

num_first_sundays = 0
for year in range(1901, 2001):
    for month in range(1, 13):
        if date(year, month, 1).weekday() == 6:  # 6 representing the 6th day of the week (Sunday)
            num_first_sundays += 1
print(num_first_sundays)
