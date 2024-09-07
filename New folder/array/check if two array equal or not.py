import numpy as np

list1 = [1, 2, 5, 4, 0, 2, 1]
list2 = [2, 4, 5, 0, 1, 1, 2]

data1 = np.array(list1)
data2 = np.array(list2)

data1=np.sort(data1)
data2=np.sort(data2)
# # Compare the two arrays element-wise
# for i in range(len(data1)):
#     if data1[i] == data2[i]:
#         print(f"Element {i} is equal")
#     else:
#         print(f"Element {i} is not equal")

# Alternatively, you can use numpy's built-in comparison function
if np.array_equal(data1, data2):
    print("The two arrays are identical")
else:
    print("The two arrays are not identical")