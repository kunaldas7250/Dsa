
# def frog_jump(index, array, k, dp):
#     if index == 0:
#         return 0
#     if dp[index] != -1:
#         return dp[index]
#     min_energy = float('inf')
#     for i in range(1, k + 1):
#         if index - i >= 0:
#             memo = frog_jump(index - i, array, k, dp) + abs(array[index] - array[index - i])
#             min_energy = min(min_energy, memo)
#     dp[index] = min_energy
#     return min_energy

# array = [30, 10, 60, 10, 60, 50]
# k = 2
# n = len(array)
# dp = [-1] * (n + 1)
# result = frog_jump(n - 1, array, k, dp)
# print(result)


#tabulation
import sys

def frog_jump():
    array = [30, 10, 60, 10, 60, 50]
    n = len(array)
    dp = [-1] * (n + 1)
    dp[0] = 0
    k = 2
    for i in range(1, n):
        min_energy = sys.maxsize
        for j in range(1, k + 1):
            if i - j >= 0:
                jump = dp[i - j] + abs(array[i] - array[i - j ])
                min_energy = min(min_energy, jump)
        dp[i] = min_energy
    return dp[n-1]

result = frog_jump()
print(result)




    