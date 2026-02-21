class CustomError(Exception):
    pass
def post(value):
    if value<0:
        raise CustomError("enterd  value is negative value:")
    else:
        raise CustomError("eneterd value is positive value")
try:
    post(2)
except CustomError as e:
    print(e)
    
