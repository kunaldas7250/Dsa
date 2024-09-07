# data = [2, 3, 2, 2, 1, 4, 1, 2, 1, 4]
# store = {}

# for i in range(len(data)):
#     if data[i] in store:
#         store[data[i]] += 1
#     else:
#         store[data[i]] = 1

# print(store)
data = [2, 3, 2, 2, 1, 4, 1, 2, 1, 4]
store = {}

for i in range(len(data)):
    if data[i] in store:
        store[data[i]] += 1
    else:
        store[data[i]] = 1

max_freq = max(store.values())
result = {key: value for key, value in store.items() if value == max_freq}

print(result)