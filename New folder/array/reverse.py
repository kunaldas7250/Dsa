original_array = [10, 20, 30, 40, 50, 60, 70]

# Split the array into two parts
part1 = original_array[:3]
part2 = original_array[3:]
#print(part1)
#print(part2)
# Reverse each part
part1 = part1[::-1]
part2 = part2[::-1]

# Combine the reversed parts back into the original array
result_array = part1 + part2
#now reverse
result_array.reverse()

print("combine array reverse",result_array)
print(result_array)