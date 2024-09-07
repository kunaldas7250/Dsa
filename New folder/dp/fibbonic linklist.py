# class Node:
#     def __init__(self, data):
#         self.data = data
#         self.next = None

# def fibonacci(n):
#     head = Node(0)
#     head.next = Node(1)
#     prev = head
#     curr = head.next

#     for _ in range(2, n):
#         next_node = Node(prev.data + curr.data)
#         curr.next = next_node
#         prev = curr
#         curr = next_node

#     return head

# def print_fibonacci(head):
#     while head:
#         print(head.data, end=" ")
#         head = head.next
#     print()

# head = fibonacci(10)  # Generate the first 10 Fibonacci numbers
# print_fibonacci(head)  # Print the Fibonacci sequence

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        
def fibnonic(n):
    # Create the first two nodes for the Fibonacci sequence
    head = Node(0)  # First node with value 0
    head.next = Node(1)  # Second node with value 1
    
    prev = head  
    curr = head.next
    
    # Generate the remaining nodes for the sequence
    for i in range(2, n):
        # Create a new node with the sum of the previous two nodes' data
        next_node = Node(prev.data + curr.data)
        curr.next = next_node  # Link current node to the next node
        prev = curr  # Move prev pointer to the current node
        curr = next_node  # Move curr pointer to the new node
    
    return head

def print_fibnonic(head):
    while head:
        print(head.data, end=" ")
        head = head.next
    print()

# Create a Fibonacci linked list with 10 nodes
head = fibnonic(10)
print_fibnonic(head)  # Print the Fibonacci sequence
