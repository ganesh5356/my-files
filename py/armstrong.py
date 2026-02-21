def armstrong(n):
    num_str=str(n)
    num_digits=len(num_str)
    return sum(int(digit)**num_digits for digit in num_str)==n
print(armstrong(123))


#another method
import math
a=int(input("enter a number"))
s=0
len=int(math.log10(a)+1)
temp=a
while temp>0:
    s=s+int(math.pow(temp % 10,len))
    temp//=10
    
if a==s:
    print(a,"is armstrong no")
    
else:
    print(a,"is not armstrong no")