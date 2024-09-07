# def subsequence(index,n,s,sum,arr,ds,ans):
   
#     if index==n:
#            if s==sum:
#                ans.append(ds[:])
#                return
#     ds.append(arr[index])  
#     s+=arr[index]
#     subsequence(index+1,ds,s,sum,arr,n)
#     s-=arr[index]
#     ds.pop() 
#     subsequence(index+1,ds,s,sum,arr,n) 
       
# def find_sequence(arr,target_sum):
#     n=len(arr)
#     ans=[]
#     subsequence(0,n,0,target_sum,arr,[],ans)
#     return ans
           
    
# list=[1,2,1]
# sum=2
# n=len(list)
# result=find_sequence(list,sum)
# print(result)

# def subsequence(index, n, s, sum, arr, ds, ans):
#     if index == n:
#         if s == sum:
#             ans.append(ds[:])
#             return
#         return
#     ds.append(arr[index])
#     s += arr[index]
#     subsequence(index+1, n, s, sum, arr, ds, ans)
#     s -= arr[index]
#     ds.pop()
#     subsequence(index+1, n, s, sum, arr, ds, ans)

# def find_subsequences(arr, target_sum):
#     n = len(arr)
#     ans = []
#     subsequence(0, n, 0, target_sum, arr, [], ans)
#     return ans

# list = [1, 2, 1]
# sum = 2
# n = len(list)
# result = find_subsequences(list, sum)
# print(result)   



def subsequence(index, n, s, sum, arr, ds, ans):
    if index == n:
        if s == sum:
            ans.append(ds[:])
            return True
        return False
    ds.append(arr[index])
    s += arr[index]
    if subsequence(index+1, n, s, sum, arr, ds, ans):
        return True
    s -= arr[index]
    ds.pop()
    if subsequence(index+1, n, s, sum, arr, ds, ans):
        return True
    return False

def find_subsequences(arr, target_sum):
    n = len(arr)
    ans = []
    subsequence(0, n, 0, target_sum, arr, [], ans)
    return ans

list = [1, 2, 1]
sum = 2
n = len(list)
result = find_subsequences(list, sum)
print(result)