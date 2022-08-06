# Date: 2022-08-05
# Purpose: randomly generate integer and ask for answer of their multiply
# Author: Xiaoqi Zhao
import random
cont = 'y'
while cont == 'y':
    a = random.randint(101,150)
    b = random.randint(1,9)
    print(a, " x ", b, " = ?")
    answer= int(input())
    while answer != a * b:
        print("think again")
        answer= int(input())
    print("Excellent! Continue? (y/n)")
    cont = input()