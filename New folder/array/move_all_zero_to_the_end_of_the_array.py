# import numpy as np 
# list=[1,0,2,0,3,0,0,4,5,0]
# data=np.array(list)
# temp=[]
# for i in range(len(data)):
#     if data[i]!=0:
#         temp.append(data[i])
# data[:len(temp)] = temp
# print(data)
# data[len(temp):] = 0
# print(data)
       
# import numpy as np 
# list=[1,0,2,0,3,0,0,4,5,4]
# data=np.array(list)
# for i in range(len(data)):
#     for j in range(i+1):
#         if(data[i]!=0):
#             if(data[j]==0):
#                 data[[i, j]] = data[[j, i]]
#                 break
# print(data)  

import numpy as np
list=[1,0,2,0,3,0,0,4,5,4]
data=np.array(list)
non_zero_idx = 0
for i in range(len(data)):
    if data[i] != 0:
        data[[non_zero_idx, i]] = data[[i, non_zero_idx]]
        non_zero_idx += 1
print(data)                    
       

        