# #suppose this array=2,3,5,7
# #target_sum=7
# #output=[[2,2,3],[5,2],[7]]

# def sequence(index,sum,s,arr,ds,ans):
#     if  index==len(arr):
#         if target==0:
#             ans.append(ds[:])
#             return
#     ds.append(arr[index])    
#     s+=arr[index]
#     sequence(index,sum,s,arr,ds,ans)
#     ds.size()-1
#     s-=arr[index]
#     ds.pop()
#     sequence(index+1,sum,s,arr,ds,ans)
    
# def find_sequene(arr,target_sum):
#     ans=[]
#     n=len(arr)
#     sequence(0,target_sum,0,arr,[],ans)
#     return ans

# list=[2,3,5,7]
# sum=7
# n=len(list)
# result=find_sequene(list,sum)
# print(result)        
        
def sequence(index, target, s, arr, ds, ans):
    if index == len(arr):
        if s == target:
            ans.append(ds[:])
        return
    ds.append(arr[index])
    s += arr[index]
    if s <= target:
        sequence(index, target, s, arr, ds, ans)
    s -= arr[index]
    ds.pop()
    sequence(index + 1, target, s, arr, ds, ans)

def find_sequence(arr, target_sum):
    ans = []
    n = len(arr)
    sequence(0, target_sum, 0, arr, [], ans)
    return ans

list = [2,3,6,7]
sum = 7
n = len(list)
result = find_sequence(list, sum)
print(result)