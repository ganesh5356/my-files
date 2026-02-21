class bankaccouunt:
    def __init__(self,balance):
        self.__balance=balance
        
    def deposit(self,amount):
        self.__balance+=amount
        
    def withdraw(self,amount):
        if amount<=self.__balance:
            self.__balance-=amount
            
        else:
            print("insufficient balance")
            
    def get_balance(self):
        return self.__balance

account=bankaccouunt(1000)
account.deposit(500)
print(account.get_balance())
account.withdraw(200)
print(account.get_balance())      
        