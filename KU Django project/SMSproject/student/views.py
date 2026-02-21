from django.http import HttpResponse
from django.shortcuts import render

# Create your views here
def index(request):
    return render(request,'student/index.html')

# create other views as about

def about(request):
    return render(request,'student/about.html')


# create other views as login
def login(request): 
   if request.method == 'POST':
       username = request.POST.get('name')
       password = request.POST.get('passwd')
       # For demonstration, we will just check if username and password are 'admin'
       if username == 'student' and password == 'student@123':
           return HttpResponse(f'login sucessfull !')
       else:
           return HttpResponse('Invalid credentials, please try again.')
   return render(request,'student/login.html')

# create other views as register
def register(request):
    if request.method == 'POST':
        # Process the form data here
        name = request.POST.get('name')
        email = request.POST.get('email')
        usn = request.POST.get('usn')
        college = request.POST.get('College')
        degree = request.POST.get('degree')
        branch = request.POST.get('branch')
        semester = request.POST.get('semester')
        #print or log the data for demonstration
        print(f'Registered Student: \n name: {name},\n Email: {email},\n USN: {usn},\n College: {college},\n Degree: {degree},\n Branch: {branch},\n SEM: {semester}')
        
        # display student desatils in ui
        context={
            'name': name,
            'email': email,
            'usn': usn,
            'college': college,
            'degree': degree,
            'branch': branch,
            'semester': semester
        }
        
        return render(request, 'student/display.html', context)
    return render(request,'student/register.html')


