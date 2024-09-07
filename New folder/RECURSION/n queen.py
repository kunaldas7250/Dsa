#queen problem
#every row should have 1 queen
#every column should have 1 queen
#no two queen are attack each other

def is_safe(board, row, col):
        for i in range(col):
            if board[row][i]==1:
                return False
            
              
def set_queens(col,n,board,result):
    
    if col==n:
        result.append([row[:] for row in board])
        return
    for i in range(n):
        if is_safe(board,i,col):
            board[i][col]=1
            set_queens(col+1,n,board,result)
            board[i][col]=0
                           
    
def solve_n_queen(n):
    board=[[0]*n for _ in range(len(n))]
    result=[]
    set_queens(0,n,board,result)
    return result    



n=4
result=solve_n_queen(n)
for i,solution in enumerate(result):
    print(f"Slution,{i+1}:")
    for  row in solution:
        print(row)
    print()
    



# import numpy as np
# import pandas as pd

# data = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]])

# data = pd.DataFrame(data, index=["1st row", "2nd row", "3rd row", "4th row"], columns=["col1", "col2", "col3", "col4"])
# print(data)
# print()

# print("get 12 no", data.loc["3rd row", "col4"])
# print("get 6 no",data.loc["2nd row","col2"])





