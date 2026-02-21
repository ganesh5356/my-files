def merge(dict1,dict2):
    return{**dict1,**dict2}
print(merge{'a':1'b':2},{'c':3'd':4})