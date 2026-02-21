#using filter keyword finding even number
def even(x):
    return x%2==0
no=[1,2,3,4,5,6,7,8,9,10]
ev=filter(even,no)
print(list(ev))


#odd 
def odd(x):
    return x%2!=0
no=[1,2,3,4,5,6,7,8,9,10]
od=filter(odd,no)
print(list(od))
    
#using lambda even
no=[1,2,3,4,5,6,7,8,9,10]
even=filter(lambda  x:x%2==0 ,no)
print(list(even))

#using lambda odd
no=[1,2,3,4,5,6,7,8,9,10]
odd=filter(lambda  x:x%2!=0 ,no)
print(list(odd))