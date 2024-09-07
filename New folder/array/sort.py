import numpy as np

list = [10,20,30,40]
data = np.array(list)
is_sorted = True

for i in range(1, len(data)):
    if data[i] <= data[i-1]:
        is_sorted = False
        break

if is_sorted:
    print("The list is sorted.")
else:
    print("The list is not sorted.")