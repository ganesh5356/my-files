try:
    a=int(input("enter the value"))
    r=10/a
except ZeroDivisionError:
    print("you cannot divide by 0")
except ValueError:
    print("invalid input")
    
print(r)

#another method exception handling
try:
    a=int(input("enter the value"))
    r=10/a
except Exception as g:
    print("the error:",g)
else:
    print(r)