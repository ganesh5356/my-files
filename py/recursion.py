def print_no(n):
    if n>0:
        print_no(n-1)
    print(n)
n=10
print_no(n)


# problem 2
def funn(a,b):
    if a>0:
        if b>0:
            return a+b+funn(a+1,0)                                                                                                                                                             
    return a+b
a=2
b=6
print(funn(a,b))

#problem 3
def funn(a,b):
    if a>2:
        if b>2:
            return a+b+funn(a+1,b-5)
    return a-b
a=4
b=6
print(funn(a,b))
