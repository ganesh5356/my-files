a=int(input("enter the no"))
f=0
for i in range(1,a):
    if a%i==0:
        f+=i
if a==f:
    print("perfect no",a)
else:
    print("not perfect no",a)