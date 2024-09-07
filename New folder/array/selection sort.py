
# Selection sort
data = [13,46,24,52,20,9]
for i in range(len(data)):
    min_index = i
    for j in range(i+1, len(data)):
        if data[j] < data[min_index]:
            min_index = j
    data[i], data[min_index] = data[min_index], data[i]
    
print(data)           