import math
def prime(n):
    if n<=1:
        return False
    for i in range(2,int(math.sqrt(n))+1):
        if n%i==0:
            return False
        return True
    
n=int(input("enter the number"))
if prime(n):
    print(f"{n}is a prime number")
        
else:
    print(f"{n} is a not a prime number")
    
#another method ti find prime numbers in range
def is_prime(b):
    if b<=1:
        return False
    for i in range(2,int(math.sqrt(b))+1):
        if b%i==0:
            return False
        
        return True
def p(start,end):
    return[i for i in range(start,end+1)if is_prime(i)]
print(p(10,50))