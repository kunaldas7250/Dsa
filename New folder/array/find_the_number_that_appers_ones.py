import numpy as np

list_ = [1, 1, 2, 3, 3, 4, 4]
data = np.array(list_)

cnt1 = 0
cnt2 = 0
cnt3 = 0
cnt4 = 0

for i in range(len(data)):
    if data[i] == 1:
        cnt1 += 1
    elif data[i] == 2:
        cnt2 += 1
    elif data[i] == 3:
        cnt3 += 1
    elif data[i] == 4:
        cnt4 += 1

if cnt1 == 1:
    print("Element 1 appears only once")
if cnt2 == 1:
    print("Element 2 appears only once")
if cnt3 == 1:
    print("Element 3 appears only once")
if cnt4 == 1:
    print("Element 4 appears only once")
        
import numpy as np

list_ = [1, 1, 2, 3, 3, 4, 4]
data = np.array(list_)

# Create a dictionary to store the counts of each unique element
counts = {}

for i in range(len(data)):
    if data[i] in counts:
        counts[data[i]] += 1
    else:
        counts[data[i]] = 1

# Print the elements that appear only once
for key, value in counts.items():
    if value == 1:
        print(f"Element {key} appears only once")        