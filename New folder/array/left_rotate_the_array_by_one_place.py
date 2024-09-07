import numpy as np 
list=[1,2,3,4,5]
data=np.array(list)
temp=data[0]
for i in range(1,len(data)):
    data[i-1]=data[i]
    
data[len(data)-1]=temp

print(data)