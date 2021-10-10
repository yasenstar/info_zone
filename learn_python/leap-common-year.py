year = int(input("Enter a year: "))

#
# Write your code here.
#	

if year % 4 != 0:
    print(year, "is common year")
elif year % 100 != 0:
    print(year, "is leap year")
elif year % 400 != 0:
    print(year, "is common year")
else:
    print(year, "is leap year")