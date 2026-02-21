def square(x):
    return x**2

sq_list=[square(x)for x in range(1,6)]
print(sq_list)
#anoter method
li=[]
for x in range(1,6):
    li.append(square(x))
    
print(li)

#list comprehention for finding length of words
words=["jagathy","i","sandya","k","jothy","k","arun"]
l=[word for word in words if len(word)>4]
print(l)
#another method
wor=["jagathy","i","sandya","k","jothy","k","arun"]
l2=[]
for w in wor:
    if len(w)>=4:
        l2.append(w)
print(l2)

    