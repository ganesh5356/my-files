#program to find factorial of a given no
def fact(n):
    if n==0: #or we take n==1: also
        return 1
    else:
        return n*fact(n-1)
    
print(fact(5))

