# import numpy as np 
# list=[1,2,3,4,5]
# list2=[2,5,4,7,10]
# data=np.array(list)
# data2=np.array(list2)
# result=np.intersect1d(data,data2)
# print(result)


import numpy as np 
list1=[1,2,3,4,5]
list2=[2,5,4,7,10]
data=np.array(list1)
data2=np.array(list2)
result=[]
for i in range(len(data)):
    for j in range(len(data2)):
        if data[i]==data2[j]:
            result.append((data[i]))
           
# for item in result:
#     print(f"Element {item[0]} is present at index {item[1]} in list1 and at index {item[2]} in list2.")
print(result)