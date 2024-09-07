# import numpy as np 
# list=[1,1,2,3,4,5]
# list2=[2,3,4,4,5,6]
# data=np.array(list)
# data2=np.array(list2)
# # result = np.intersect1d(data, data2)
# result=np.union1d(data,data2)
# print(result)



import numpy as np

list1 = [1, 1, 2, 3, 4, 5,7]
list2 = [2, 3, 4, 4, 5, 6,7]

data = np.array(list1)
data2 = np.array(list2)

union = set()
for i in data:
    if i not in union:
        union.add(i)
for j in data2:
    if j not in union:
        union.add(j)

print(list(union))
            