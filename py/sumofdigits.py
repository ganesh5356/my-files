def sod(n):
    return sum(map(int,str(n)))

num=int(input("enter the number"))
print("sum of digit",sod(num))

#another method using map keyword

def sum(*args):
    t=0
    for num in args:
        t+=num
    return t
    
print(sum(1,2,3))
