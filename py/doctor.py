list=[]
a=int(input("enter elements how many you want"))
for i in range(0,a):
    v=int(input("enter the ages"))
    list.insert(i,v)
print("final memebers in ages are:",list)
if list>0 and list<17:
    print(200)  
