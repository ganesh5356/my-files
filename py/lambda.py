#using lambda solving arithmetic operators

add=lambda a,b:a+b
print(add(10,30))
#sub
sub=lambda a,b:a-b
print(sub(10,30))
#mul
mul=lambda a,b:a*b
print(mul(10,30))
#div
div=lambda a,b:a/b
print(div(10,30))


#square numbers without using lambda
def square(x):
    return x**2

no=[1,2,3,5,7,8]
sq_no=map(square,no)
print(list(sq_no))
    
#another method using lambda
no=[1,2,3,4,5,6]
sq=map(lambda x: x**2,no)
print(list(sq))

#addtion of 2 no's using lambda
n1=[1,2,3,4,5]
n2=[2,4,5,7,8]
sqn=map(lambda n1,n2:n1+n2,n1,n2)
print(list(sqn))

#another method without using lambda
def add(x,y):
    return x+y
l1=[1,2,3,4]
l2=[3,5,7,8]
sum=map(add,l1,l2)
print(list(sum))

    