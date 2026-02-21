class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None

    def is_empty(self):
        return self.head is None

    def add_at_beginning(self, data):
        new_node = Node(data)
        if self.is_empty():
            self.head = new_node
        else:
            new_node.next = self.head
            self.head.prev = new_node
            self.head = new_node
        print(f"{data} added at the beginning.")

    def add_at_end(self, data):
        new_node = Node(data)
        if self.is_empty():
            self.head = new_node
        else:
            last = self.head
            while last.next:
                last = last.next
            last.next = new_node
            new_node.prev = last
        print(f"{data} added at the end.")
# Print the list from the head to the tail 
    def display(self): 
        cur = self.head 
        while cur: 
# Traverse the list 
            print(cur.data, end=" -> " if cur.next else "\n") 
            cur = cur.next
# Delete Node from based on user Key value      
    def delete_node(self, key):
        if self.is_empty():
            print("List is empty.")
            return

        temp = self.head

        # If the head node holds the key
        if temp and temp.data == key:
            if temp.next:
                temp.next.prev = None
            self.head = temp.next
            print(f"Node {key} deleted.")
            return

        # Traverse the list to find the node to be deleted
        while temp and temp.data != key:
            temp = temp.next

        if not temp:
            print(f"Node {key} not found.")
            return

        if temp.next:
            temp.next.prev = temp.prev

        if temp.prev:
            temp.prev.next = temp.next

        print(f"Node {key} deleted.")

    

def display_menu():
    print("\nDoubly Linked List Menu")
    print("1. Add at beginning")
    print("2. Add at end")
    print("3. Delete node")
    print("4. Display")
    print("5. Exit")

if __name__ == "__main__":
    dll = DoublyLinkedList()

    while True:
        display_menu()
        choice = int(input("Enter your choice: "))

        if choice == 1:
            data = int(input("Enter data to insert at the beginning: "))
            dll.add_at_beginning(data)
        elif choice == 2:
            data = int(input("Enter data to insert at the end: "))
            dll.add_at_end(data)
        elif choice == 3:
            key = int(input("Enter the node value to delete: "))
            dll.delete_node(key)
        elif choice == 4:
            dll.display()
        elif choice == 5:
            print("Exiting...")
            break
        else:
            print("Invalid choice, please try again.")


 