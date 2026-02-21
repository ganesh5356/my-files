class Node:
    def __init__(self, data):
        self.data = data  # Store data in the node
        self.next = None  # Pointer to the next node
class Stack:
    def __init__(self):
        self.top = None  # Initialize the top as None (empty stack)
    # Check if the stack is empty
  
    def is_empty(self):
        return self.top is None
    # Push an item onto the stack
    def push(self, data):
        new_node = Node(data)  # Create a new node
        new_node.next = self.top  # Link the new node to the previous top node
        self.top = new_node  # Update the top to the new node

    # Pop an item from the stack
    def pop(self):
        if self.is_empty():
            raise IndexError("Pop from empty stack")
        popped_node = self.top  # Get the top node
        self.top = self.top.next  # Update the top to the next node
        return popped_node.data  # Return the data of the popped node

    # Peek at the top item without removing it
    def peek(self):
        if self.is_empty():
            raise IndexError("Peek from empty stack")
        return self.top.data  # Return the data at the top of the stack

    # Display the stack (for visualization)
    def display(self):
        if self.is_empty():
            print("Stack is empty")
        else:
            current = self.top
            while current:
                print(current.data, end=" -> ")
                current = current.next
            print("None")

# Usage example
stack = Stack()
# Push items onto the stack
stack.push(10)
stack.push(20)
stack.push(30)


# Display the stack
stack.display()  # Output: 30 -> 20 -> 10 -> None

# Peek at the top item
print("Top item is:", stack.peek())  # Output: Top item is: 30

# Pop items from the stack
print("Popped item:", stack.pop())  # Output: Popped item: 30
print("Popped item:", stack.pop())  # Output: Popped item: 20

# Display the stack after popping
stack.display()  # Output: 10 -> None

# Check if the stack is empty
print("Is the stack empty?", stack.is_empty())  # Output: Is the stack empty? False

# Pop the last item
print("Popped item:", stack.pop())  # Output: Popped item: 10

# Check if the stack is empty
print("Is the stack empty?", stack.is_empty())  # Output: Is the stack empty? True

# Try to pop from an empty stack (this will raise an exception)
# stack.pop()  # Uncommenting this will raise Index Error: Pop from empty stack

