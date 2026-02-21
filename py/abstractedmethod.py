from abc import ABC, abstractmethod
#abstarct class
class vehicle:
    @abstractmethod
    def start_eng(self):
        pass
    @abstractmethod
    def stop_eng(self):
        pass
    
#concreate class
class car(vehicle):
    def start_eng(self):
        print("car started")
        
    def stop_eng(self):
        print("car stoped")
class bike(vehicle):
    def start_eng(self):
        print("bike started")
        
    def stop_eng(self):
        print("bike stoped")
#creating object      
my_car=car()
my_bike=bike()
my_car.start_eng()
my_bike.start_eng()
my_car.stop_eng()
my_bike.stop_eng()
        