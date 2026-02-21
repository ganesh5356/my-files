// class Emp{
//     String emp_name;
//     int year_of_join;
//     String address;
//     Emp(String a, int b, String c){
//         a=emp_name;
//         b=year_of_join;
//         c=address;
//         String sum=a+b+c;
//         System.out.println(sum);
//     }
// }

// public class Employee {
//     public static void main(String[] args) {
//         Emp obj=new Emp("robert", 1994, "c/4-wallstreet banglore");
//     }
// }
class Emp {
    String emp_name;
    int year_of_join;
    String address;

    // Constructor to initialize fields and print concatenated result
    Emp(String a, int b, String c) {
        emp_name = a;        // Correct field assignment
        year_of_join = b;
        address = c;
        
        // Concatenating the details and printing
        String sum = a+"   "+b+"   "+c; 
        System.out.println(sum);
    }
}

public class Employee {
    public static void main(String[] args) {
        // Create object and pass values to constructor
        System.out.println("name  year   address");
        Emp obj = new Emp("robert", 1994, "c/4-wallstreet banglore");
        Emp obj1= new Emp("sam", 2000, "68/d-wallstreet banglore");
        Emp obj2= new Emp("john", 1999, "26/B-wallstreet banglore");
        // No need to call obj.Emp(), it's already handled in constructor
    }
}
