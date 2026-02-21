matrix=[[1,2,3],[4,5,6],[7,8,9]]
flat_list=[num for row in matrix for num in row]
print(flat_list)
#another method
matri=[[1,2,3],[4,5,6]]
list=[]
for row in matri:
    for num in row:
        list.append(num)
        
print(list)