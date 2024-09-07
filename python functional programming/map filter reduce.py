# #data=[10,20,40,30,60]
# #output:[10,30,60,70,90]
# def sum_list():
#     data=[10,20,40,30,60]
#     result=[data[0]]
#     for i in range(1,len(data)):
#         result.append(result[-1]+data[i])
#     return result
    
    
# result=sum_list()
# print(result)    


# def sum_list():
#     data = [10, 20, 40, 30, 60]
#     result = [data[0]]
#     mapped_result = list(map(lambda x: result[-1] + x, data[1:]))
#     result.extend(mapped_result)
#     return result

# result = sum_list()
# print(result)


# def cube():
#     data = [1, 2, 3, 4, 5]
#     result = list(map(lambda x: x ** 3, data))
#     return result
# result = cube()
# print(result)



data = [1, 2, 3, 4]
def sum():
    global data 
    result = list(map(lambda x, y: x + y, data, data[1:]))
    return result
result = sum()
print(result)  


#filter
filtered_result = list(filter(lambda x: x % 2 == 0, data))
print(filtered_result)  #filter 1
def gte(a):
    return a>1
    
filtered_result2=list(filter(gte,data))
print(filtered_result2)

#reduce
from functools import reduce


data = [1, 2, 3, 4]

result3 = reduce(lambda x, y: x - y, data)
print("result3", result3)  


result4 = reduce(lambda x, y: x * y, data)
print("result4", result4)  

from functools import reduce

data = [1, 2, 3, 4]

def cum_prod(x, y):
    x.append(x[-1] * y)
    return x

result5 = reduce(cum_prod, data[1:], [data[0]])
print("result5",result5)  # [1, 2, 6, 24] 