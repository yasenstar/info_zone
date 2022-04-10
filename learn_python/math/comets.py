alpha = 6
beta = 8
gamma = 9

first_year = 1980
last_year = 3000

for i in range(first_year, last_year, alpha):
    for j in range(first_year, last_year, beta):
        for k in range(first_year, last_year, gamma):
            if (i == j) & (j == k):
                print(i)