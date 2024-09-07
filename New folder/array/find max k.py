
               
import numpy as np

list = [1, 23, 12, 9, 30, 2, 50]
data = np.array(list)
k = 3

for i in range(len(data)):
    for j in range(i+1, len(data)):
        if data[i] < data[j]:
            data[i], data[j] = data[j], data[i] 

print(data[:k])  
       
import numpy as np

list=[1, 23, 12, 9, 30, 2, 50]
data=np.array(list)
k=2
store=[]

for i in range(len(data)):
  if len(store) < k:
      store.append(data[i])
  elif data[i] > min(store):
      store.remove(min(store))
      store.append(data[i])

store.sort(reverse=True)
print(store)

     
              