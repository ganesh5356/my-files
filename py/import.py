from functools import reduce

def mul(x,y):
    return x*y
n=[1,2,3,4,5]
r=reduce(mul,n)
print(r)

# another method
n=[1,2,3,4,5]
r=reduce(lambda x,y:x*y,n)
print(r)


#even
