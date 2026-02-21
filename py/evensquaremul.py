from functools import reduce
n=[1,2,3,4,5,6]
r=filter(lambda x:x%2==0,n)
d=list(r)
print(d)
#square
l=map(lambda x:x**2,d)
f=list(l)
print(f)
#mul
e= reduce(lambda x,y:x*y,f)
print(e)

