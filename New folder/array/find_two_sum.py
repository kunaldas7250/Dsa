# import numpy as np

# test = np.array([2,7,11,15])
# target = 9

# def find_two_sum(test, target):
#     for i in range(len(test)):
#         for j in range(i + 1, len(test)):
#             if test[i] + test[j] == target:
#                 print("i =", i, "j =", j)
#                 return  

# find_two_sum(test, target)

import numpy as np

test = np.array([6,2,3,11,15,7])
target = 9

def find_two_sum(test, target):
    num_dict = {}
    for i, num in enumerate(test):
        print("i",i,"num",num)
        complement = abs(target - num)
        print(complement)
        if complement in num_dict:
            print(num_dict)
            print("i =", num_dict[complement], "j =", i)
            return
        num_dict[num] = i

find_two_sum(test, target)