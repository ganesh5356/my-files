def  safe_divide(a,b):
    try:
        return a/b
    except ZeroDivisionError:
        return "cannot divide by zero"
print(safe_divide(10,5))