class calculator:
    def add(s,a,b):
        return a+b
    def sub(s,a,b):
        return a-b
    def mul(s,a,b):
        return a*b
    def div(s,a,b):
        if b==0:
            return "number cannot be disible zero"
        return a/b
    
cal=calculator()
print(cal.add(10,20))
print(cal.sub(10,20))
print(cal.mul(10,20))
print(cal.div(10,20))
