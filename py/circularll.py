class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class CircularLinkedList:
    def __init__(self):
        self.top = None

    def is_empty(self):
        return self.top is None

    def add_to_empty(self, data):
        if self.is_empty():
            new_node = Node(data)
            self.top = new_node
            self.top.next = new_node
        else:
            print("List is not empty.")

    def add_at_beginning(self, data):
        if self.is_empty():
            self.add_to_empty(data)
        else:
            new_node = Node(data)
            new_node.next = self.top.next
            self.top.next = new_node

    def add_at_end(self, data):
        if self.is_empty():
            self.add_to_empty(data)
        else:
            new_node = Node(data)
            new_node.next = self.top.next
            self.top.next = new_node
            self.top = new_node

    def traverse(self):
        if self.is_empty():
            print("List is empty.")
        else:
            current = self.top.next
            while True:
                print(current.data, end=" ")
                current = current.next
                if current == self.top.next:
                    break
            print()

    def delete_node(self, key):
        if self.is_empty():
            print("List is empty.")
            return

        if self.top.next == self.top and self.top.data == key:
            self.top = None
            return

        current = self.top.next
        prev = self.top

        while current != self.top:
            if current.data == key:
                prev.next = current.next
                return
            prev = current
            current = current.next

        if current == self.top and current.data == key:
            prev.next = current.next
            self.top = prev

def display_menu():
    print("\nCircular Linked List Menu")
    print("1. Add at beginning")
    print("2. Add at end")
    print("3. Delete node")
    print("4. Display")
    print("5. Exit")

if __name__ == "__main__":
    cll = CircularLinkedList()

    while True:
        display_menu()
        choice = int(input("Enter your choice: "))

        if choice == 1:
            data = int(input("Enter data to insert at the beginning: "))
            cll.add_at_beginning(data)
        elif choice == 2:
            data = int(input("Enter data to insert at the end: "))
            cll.add_at_end(data)
        elif choice == 3:
            key = int(input("Enter the node value to delete: "))
            cll.delete_node(key)
        elif choice == 4:
            print("Circular Linked List: ", end="")
            cll.traverse()
        elif choice == 5:
            print("Exiting...")
            break
        else:
            print("Invalid choice, please try again.")
