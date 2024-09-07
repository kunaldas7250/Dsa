# user = int(input("Enter your number: "))
# add2 = 0
# while user > 0:
#     digit = user % 10
#     add2 += digit
#     user //= 10
# print("Sum of digits:", add2)

# for i in range(len(add2)):
#     if add2%2==0:
#         print("Sum of digits is even")
#     else:
#         add2=add2+1
#         print("google prime no")


user = int(input("Enter your number: "))
add2 = 0
while user > 0:
    digit = user % 10
    add2 += digit
    user =user// 10

if add2 > 1:
    for i in range(2, add2):
        if add2 % i == 0:
            print(add2, "is not a prime number")
            break
    else:
        print(add2, "is a prime number")
else:
    print(add2, "is not a prime number")