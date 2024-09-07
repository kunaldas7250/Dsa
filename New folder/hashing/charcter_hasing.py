
# import numpy as np

# list = ["a", "b", "c", "d", "a", "b", "e", "j", "c"]
# data = np.array(list)
# store = {}

# for char in data:
#     if char in store:
#         store[char] += 1
#     else:
#         store[char] = 1

# print([value for value in store.values()])

from collections import Counter

my_list = ["a", "b", "c", "d", "a", "b", "e", "j", "c"]
counter = Counter(my_list)

for item, count in counter.items():
    print(f"{item}: {count}")

print("Test", counter["c"])
print(list(counter.values()))