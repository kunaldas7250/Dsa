import numpy as np 
list=[10,20,30,40,50,60]
data=np.array(list)
user=int(input("enter the number you search:"))
for i in range(len(data)):
    if data[i]==user:
        print("found")
        print(i)
        break
    else:
        print("not found")