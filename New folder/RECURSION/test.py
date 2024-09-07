def is_safe(board, row, col):
    """
    Check if it's safe to place a queen at (row, col) on the board.
    """
    # Check this row on left side
    for i in range(col):
        if board[row][i] == 1:
            return False

    # Check upper diagonal on left side
    for i, j in zip(range(row, -1, -1), range(col, -1, -1)):
        if board[i][j] == 1:
            return False

    # Check lower diagonal on left side
    for i, j in zip(range(row, len(board), 1), range(col, -1, -1)):
        if board[i][j] == 1:
            return False

    return True


def set_queens(col, n, board, result):
    """
    Place queens on the board using recursion and hashing.
    """
    if col == n:
        # If all queens are placed, add the board to the result
        result.append([row[:] for row in board])
        return

    for i in range(n):
        if is_safe(board, i, col):
            # Place this queen in board[i][col]
            board[i][col] = 1

            # recur to place rest of the queens
            set_queens(col + 1, n, board, result)

            # If placing queen in board[i][col] doesn't lead to a solution then
            # remove queen from board[i][col]
            board[i][col] = 0


def solve_n_queens(n):
    """
    Solve the N-Queens problem.
    """
    board = [[0] * n for _ in range(n)]
    result = []
    set_queens(0, n, board, result)
    return result


# Example usage
n = 4
result = solve_n_queens(n)
for i, solution in enumerate(result):
    print(f"Solution {i + 1}:")
    for row in solution:
        print(row)
    print()


#hasing
# def is_safe(board, row, col, rows, cols, diag1, diag2):
#     """
#     Check if it's safe to place a queen at (row, col) on the board.
#     """
#     if row in rows:
#         return False
#     if col in cols:
#         return False
#     if row - col in diag1:
#         return False
#     if row + col in diag2:
#         return False
#     return True


# def set_queens(col, n, board, rows, cols, diag1, diag2, result):
#     """
#     Place queens on the board using recursion and hashing.
#     """
#     if col == n:
#         # If all queens are placed, add the board to the result
#         result.append([row[:] for row in board])
#         return

#     for i in range(n):
#         if is_safe(board, i, col, rows, cols, diag1, diag2):
#             # Place this queen in board[i][col]
#             board[i][col] = 1
#             rows.add(i)
#             cols.add(col)
#             diag1.add(i - col)
#             diag2.add(i + col)

#             # recur to place rest of the queens
#             set_queens(col + 1, n, board, rows, cols, diag1, diag2, result)

#             # If placing queen in board[i][col] doesn't lead to a solution then
#             # remove queen from board[i][col]
#             board[i][col] = 0
#             rows.remove(i)
#             cols.remove(col)
#             diag1.remove(i - col)
#             diag2.remove(i + col)


# def solve_n_queens(n):
#     """
#     Solve the N-Queens problem.
#     """
#     board = [[0] * n for _ in range(n)]
#     rows = set()
#     cols = set()
#     diag1 = set()
#     diag2 = set()
#     result = []
#     set_queens(0, n, board, rows, cols, diag1, diag2, result)
#     return result


# # Example usage
# n = 4
# result = solve_n_queens(n)
# for i, solution in enumerate(result):
#     print(f"Solution {i + 1}:")
#     for row in solution:
#         print(row)
#     print()