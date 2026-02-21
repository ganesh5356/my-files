even_no=[]
for x in range(1,11):
    if x%2==0:
        even_no.append(x)
print(even_no)
# another method 
even=[x for x in range(1,11) if x%2==0]
print(even)
#check wheather given number is even or odd
even=[]
for x in range(1,9):
    if x%2==0:
        even.append("even")
    else:
        even.append("odd")
print(even)
#another methhod
even_no=["even" if x %2==0 else "odd" for x in range(1,5)]
print(even_no)