
# #memoziation dyanim programing
def frog_jump(index, array, dp):
    if index == 0:
        return 0
    if dp[index] != -1:
        return dp[index]
    left = frog_jump(index-1, array, dp) + abs(array[index] - array[index-1])
    right = float('inf')
    if index > 1:
        right = frog_jump(index-2, array, dp) + abs(array[index] - array[index-2])
    dp[index] = min(left, right)
    return dp[index]

array = [30, 10, 60, 10, 60, 50]
n = len(array)
dp = [-1] * (n + 1)  # Initialize dp array with -1
dp[0] = 0  # Base case
result = frog_jump(n-1, array, dp)  # Start from the last index
print(result)
   
            
# def frog_jump():
#     array = [30, 10, 60, 10, 60, 50]
#     n = len(array)
#     dp = [-1] * (n + 1)  # Initialize dp array with infinity
#     dp[0] = 0  # Base case

#     for i in range(1, n ):
#         right = float('inf')  
#         left = dp[i - 1] + abs(array[i] - array[i - 1])
       
#         if i > 1:
#             right = dp[i - 2] + abs(array[i] - array[i - 2])
#         dp[i] = min(left, right)

#     return dp[n-1]

# result = frog_jump()
# print(result)      



   