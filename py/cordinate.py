coordinate=[]
for x in range(1,4):
    for y in range(1,4):
        coordinate.append((x,y))
        
print(coordinate)

#another method
coordi=[(x,y)for x in range (1,4) for y in range(1,4)]
print(coordi)