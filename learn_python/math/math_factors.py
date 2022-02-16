min = int(input("please input the min: "))
max = int(input("please input max number: "))
for i in range(min,max+1):
    print(i,":")
    for j in range(1, i//2):
        if i%j==0:
            print(j)
    