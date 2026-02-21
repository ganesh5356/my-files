import os
print(os.getcwd())
print(os.listdir())

os.mkdir("yfolder")
#os.chdir("new folder")

os.rename("yfolder","renamed folder")
os.chdir("renamed folder")
print(os.getcwd())

#llist directories
def listfiles(directory):
    return os.listdir(directory)
print(listfiles(str(os.getcwd())))