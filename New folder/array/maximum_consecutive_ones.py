           

import numpy as np

list_ = [1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1,1]
data = np.array(list_)
max_ = 0
cnt = 0

for i in range(len(data)):
    if data[i] == 1:
        cnt += 1
        if cnt > max_:
            max_ = cnt
    else:
        cnt = 0

print(max_)