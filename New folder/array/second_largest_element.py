
  
  
import numpy as np

list_ = [10, 20, 50, 30, 60]
data = np.array(list_)

largest = data[0]
second_largest = -1 # Initialize with negative infinity

for num in data:
    if num > largest:
        second_largest = largest
        largest = num
    elif num > second_largest and num != largest:
        second_largest = num

print("Largest:", largest)
print("Second largest:", second_largest)