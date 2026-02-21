my_list=[1,2,3,4,5]
print(my_list)
#append is used to add values at the last
my_list.append("hello")
print(my_list[5])
#insert is used to add value where ever you want
my_list.insert(2,"hi")
print(my_list[1])
#remove is used to remove the value not position
my_list.remove(3)
print(my_list)
#pop is same as remove but it removes postions
my_list.pop(4)
print(my_list)

#another method
list=[]
a=int(input("enter elements how many you want"))
for i in range(0,a):
    v=int(input("enter rhe value insert"))
    list.insert(i,v)
print("final list is:",list)
#reverse list
new_list=list[::-1]
print("reverse list is:",new_list)
#sorting list
list.sort(reverse=False)
print(list)
#length of the list
r=len(list)
print("length of list is:",r)
#mid of the list
mid=int(a/2)
print("mid is",list[mid])
#left elemnents from mid 
c=list[:int(len(list)/2)]
print(c)
#right elements from list
g=list[int(len(list)/2)+1:]
print(g)