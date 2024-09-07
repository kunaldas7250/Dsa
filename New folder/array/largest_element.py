import numpy as np

list = [1, 2, 3, 4]
data = np.array(list)
largest = data[0]

for i in range(len(data)):
    if data[i] > largest:
        largest = data[i]

print("largest element",largest)