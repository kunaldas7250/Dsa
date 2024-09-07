




def left_rotate(arr, n, d):
    if n == 0:
        return

    # Get the effective number of rotations:
    d = d % n

    # checking if d is a multiple of n:
    if d == 0:
        return

    temp = arr[:d]  # temporary array

    # step 2: Shift last (n-d) elements
    # to the left by d places in the given array:
    arr[:n-d] = arr[d:]

    # step 3: Place the elements of the temporary
    # array in the last d places of the given array:
    arr[n-d:] = temp

# Driver code
n = 7
arr = [1, 2, 3, 4, 5, 6, 7]
d = 2

print("Before rotation:")
print(arr)

left_rotate(arr, n, d)
print("After rotation:")
print(arr)