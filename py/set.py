my_set={1,2,3}
print(my_set)
# to add two set we use union_set keyword
set1={1,2,3,4}
set2={3,4,5}
union_set= set1 | set2
print(union_set)
# to see duplicate values we use intersection_set keyword
intersection_set= set1 & set2
print(intersection_set)
# differnce is use to see the repeted values from two sets
differnce=set1-set2
differnce=set2-set1
print(differnce)
#sym_dif is used to remove the repeted values from set and show only the single values
sym_dif=set1^set2
print(sym_dif)