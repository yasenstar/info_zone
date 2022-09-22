for x1 in range(100000,999999):
    first_n = str(x1)
    slice_1 = first_n[2:6]
    if slice_1 == slice_1[::-1]:
        x2 = x1 + 1
        first_n = str(x2)
        slice_2 = first_n[1:6]
        if slice_2 == slice_2[::-1]:
            x3 = x2 + 1
            first_n = str(x3)
            slice_3 = first_n[1:5]
            if slice_3 == slice_3[::-1]:
                x4 = x3 +1
                first_n = str(x4)
                if first_n == first_n[::-1]:
                    print(x1)
                    # break