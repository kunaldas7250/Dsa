


import numpy as np

list = [10, 20, 30, 40, 10, 20, 40]
data = np.array(list)

# Create an empty dictionary to store the frequency of each number
freq_dict = {}

# Iterate over the data and update the frequency dictionary
for num in data:
    if num in freq_dict:
        freq_dict[num] += 1
    else:
        freq_dict[num] = 1

# # Query the frequency of a given number
# q = int(input("Enter the number of queries: "))
# for _ in range(q):
#     number = int(input("Enter a number: "))
#     print(freq_dict.get(number, 0))    
print(freq_dict.values())

from collections import Counter
my_list = [10, 20, 30, 40, 10, 20, 40]
Counter=Counter(my_list)
print(list(Counter.values()))