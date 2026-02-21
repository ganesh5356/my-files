a=int(input())
b=a**2
c=0
while(b>0):
    c=c+b%10
    b=b//10
if a==c:
    print("neon number",a)
else:
    print("not neon number",a)