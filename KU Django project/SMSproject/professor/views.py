from django.http import HttpResponse
from django.shortcuts import render


# create register page for professor
def register(request):
    if request.method == 'POST':
        # Process the form data here
        name = request.POST.get('username')
        email = request.POST.get('email')
        department = request.POST.get('department')
        designation = request.POST.get('designation')
        # Print or log the data for demonstration
        print(f'Registered Professor: \n Name: {name},\n Email: {email},\n Department: {department},\n Designation: {designation}')
        
        # You can add code to save this data to the database or perform other actions
        
        return HttpResponse(f'Thank you for registering, Professor {name}!')
    return render(request, 'professor/register.html')

def login(request):
    if request.method == 'POST':
        # Process login data here
        name = request.POST.get('username')
        password = request.POST.get('password')
        if name =='professor' and password == 'professor@123':
            return HttpResponse(f'Welcome back, Professor {name}!')
        else:
            return HttpResponse('Invalid credentials, please try again.')
        # You can add code to authenticate the user here
        
    return render(request, 'professor/login.html')