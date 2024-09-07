#peak it only once time either you peak or not peak
#array=[1,1,2,2]
#output=[[1,1,2],[2,2]]
# def sequence(index,targe_sum,array,ds,ans):
#     if targe_sum==0:
#         ans.append(ds[:])
#         return
#     for i in range(index,len(array)):
#         if i>index and array[i]==array[i-1]:continue
#         if array[i]>targe_sum:break
#     ds.append(array[index])
#     sequence(index+1,targe_sum,array,ds,ans)
#     ds.pop()
    
# array=[10, 1, 2, 7, 6, 1, 5]
# targe_sum=8
# ans=[]
# sequence(0,targe_sum,array,[],ans)
    
def sequence(index, target_sum, array, ds, ans):
    if target_sum == 0:
        ans.append(ds[:])
        return
    for i in range(index, len(array)):
        if i > index and array[i] == array[i-1]:
            continue
        if array[i] > target_sum:
            break
        ds.append(array[i])
        sequence(i+1, target_sum - array[i], array, ds, ans)
        ds.pop()

array =[1,2,1]
target_sum = 2
ans = []
array.sort()
sequence(0, target_sum, array, [], ans)
print(ans)       