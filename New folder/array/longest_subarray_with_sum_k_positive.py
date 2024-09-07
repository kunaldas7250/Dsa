import numpy as np 
list=[1,2,3,1,1,1,1,4,2,3]
k=3
data=np.array(list)
store={}
for i in range(len(data)):
    for j in range(i,len(data)):
        if j-i+1==k:
            store[tuple(data[i:j+1])]=store.get(tuple(data[i:j+1]),
                                                0)+1
            
    