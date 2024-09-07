

import numpy as np
list1=[1,2,4,5]
# list1 = [1, 2, 4, 6, 3, 7, 8]
data = np.array(list1)
data=np.sort(data)
store = []

for i in range(len(data)):
    if i > 0 and data[i] - data[i-1] > 1:
        missing_num = data[i-1] +1
        print(data[i])
        print(f"Missing number: {missing_num}")
    store.append(data[i])


        

# def find_missing_element(numbers):
#     n = len(numbers) + 1
#     xor1 = 0
#     xor2 = 0

#     for i in range(1, n + 1):
#         xor1 = xor1 ^ i

#     for num in numbers:
#         xor2 = xor2 ^ num

#     return xor1 ^ xor2

# numbers = [1, 2, 4, 5]
# print(find_missing_element(numbers))  # Output: 3