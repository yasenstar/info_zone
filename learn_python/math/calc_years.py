aa = 7
bb = 9
cc = 13

first_year = 1983
last_year = 3000

for i in range(first_year, last_year, aa):
    for j in range(first_year, last_year, bb):
        for k in range(first_year, last_year, cc):
            if (i == j) & (j == k):
                print (i)   