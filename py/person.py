class person:
    def __init__(self,name,age,insta):
        self.name=name
        self.age=age
        self.insta=insta
        
class student(person):
    def __init__(self,name,age,insta,roll_no,marks):
        super().__init__(name,age,insta)
        self.roll_no=roll_no
        self.marks=marks
        
stu=student("ganesh",19,"ganesh_kumar_18",25,100)
print(stu.name,stu.age,stu.roll_no,stu.marks)
print(stu.insta)        