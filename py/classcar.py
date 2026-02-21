#class attribute
class car:
    wheels=4
    
    #constructor
    def __init__(self,brand,model):
        self.brand=brand
        self.model=model
    #method  
    def start(self):
        print(f"the {self.brand} {self.model} is starting")
        
my_car=car("audi","q3")
my_car=car("mercedes","G-wagon")

print(my_car.brand)
print(my_car.model)
my_car.start()

#another example
class bike:
    
    def __init__(b,brand,name,model,type):
        b.brand=brand
        b.name=name
        b.model=model
        b.type=type
        
    def start(b):
        print(f"your {b.brand} {b.name} {b.model} model with {b.type} is ready to ride now")
        
    def __del__(b):
        print(f"your {b.brand} {b.name} {b.model} model with {b.type} is not  ready to ride now")
        
        
mybike=bike("honda","unicorn","BS6","gear")


print(mybike.brand)
print(mybike.name)
print(mybike.model)
print(mybike.type)

mybike.start()

        
        
        