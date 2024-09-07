                       
import numpy as np

list = [1, 1, 2, 2, 2, 3, 3,3]
data = np.array(list)
data2 = []
cn1 = 0
cnt2 = 0
cnt3 = 0

for i in range(len(data)):
    if data[i] == 1:
        cn1 += 1
        if cn1 == 1:
            data2.append(data[i])
    elif data[i] == 2:
        cnt2 += 1
        if cnt2 == 1:
            data2.append(data[i])
    elif data[i] == 3:
        cnt3 += 1
        if cnt3 == 1:
            data2.append(data[i])

print(data2)