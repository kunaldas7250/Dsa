# def sequence(index,s,sum,arr):
#     if  index == len(arr):
#         if s==sum:
#             return 1
#         else:
#             return 0
#     s+=arr[index]
#     l=sequence(index+1,s,sum,arr)
#     s-=arr[index]
#     r=sequence(index+1,s,sum,arr)
#     return l+r
# def count_subseuence(arr,target_sum):
#     n=len(arr)
#     sequence(0,0,2,arr)
    
# list=[1,2,1]
# sum=2
# n=len(list)
# result=count_subseuence(list,sum)
# print(result)    
        
    
def sequence(index, s, sum, arr):
    if index == len(arr):
        if s == sum:
            return 1
        else:
            return 0
    s += arr[index]
    l = sequence(index+1, s, sum, arr)
    s -= arr[index]
    r = sequence(index+1, s, sum, arr)
    return l + r

def count_subseuence(arr, target_sum):
    n = len(arr)
    return sequence(0, 0, target_sum, arr)

list = [1, 2, 1]
sum = 2
n = len(list)
result = count_subseuence(list, sum)
print(result)   
    
    
    
    
    
    
    
    
    
    
    
    
    

   