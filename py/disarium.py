import math
a=int(input("enter a number"))
s=0
len=int(math.log10(a)+1)
temp=a
while temp>0:
    s=s+int(math.pow(temp % 10,len))
    temp//=10
    len=len-1
    
if a==s:
    print(a,"is disarium no")
    
else:
    print(a,"is not disarium no")