// class Pen {
//     String color;
//     String type;

//     public void write() {
//         IO.println("writting something");
//     }
//     public  void printColor() {
//         IO.println(this.color);
//     }
// }


// class Student {
//     String name; 
//     int age;

//     Student() {
//         IO.println("constructor called");
//     }

//     public void printInfo() {
//         IO.println(this.name);
//         IO.println(this.age);
//     }
// } // non perameter constructor jisme koi str
//  ya int type kuch na dea ho

// class Employee {
//     String name;
//     int salary;
    

//     public void printDetail() {
//         IO.print(this.name);
//         IO.print(this.salary);
//     }
    
// }


// class Mobile {
//     String brand;
//     int amount;
//     float GB;


//     public void printInfo() {
//         IO.print(this.GB);
//         IO.print(this.brand);
//         IO.print(this.amount);
//     }
// }

// public class Oops {


    
//     public static void main(String[] args) {
//         // Pen pen1 = new Pen();
//         // pen1.color = "blue";
//         // pen1.type = "gel";

//         // Pen pen2 = new Pen();
//         // pen2.color = "black";
//         // pen2.type = "ballpoint";

//         // // pen1.write();
//         // pen1.printColor();
//         // pen2.printColor();


//         // Student s1 = new Student();
//         // s1.name = "aman";
//         // s1.age = 26;

//         // s1.printInfo();

//         // Employee e1 = new Employee();
//         // e1.name = "aakansha";
//         // e1.salary = 60000;
//         // e1.printDetail();

//         // Mobile m1 = new Mobile();
//         // m1.brand = "Redme";
//         // m1.GB = 1.2f;
//         // m1.amount = 15000;
        
//         // m1.printInfo();

        


//     }
// }

// class Employee {
//             String name;
//             int salary;


//             public void printInfo() {
//                 IO.println(this.name);
//                 IO.println(this.salary);
//             }

//             Employee(String name, int salary) {
//                 this.name = name;
//                 this.salary = salary;
//             }

//         }


// public class Oops {
//     public static void main(String[] args) {

//         Employee e1 = new Employee("Aaaknsha", 25000);
//          e1.printInfo();

//         Employee e2 = new Employee("Rahul", 350000);
//         e2.printInfo();

        
        

//     }
// }

// class Company {
//     String name;
//     String Role;
//     int salary;

//     public void printDATA() {
//         IO.println(this.name);
//         IO.println(this.Role);
//         IO.println(this.salary);
//     }
    
//     Company(String name, String Role, int salary) {
//         this.name = name;
//         this.Role = Role;
//         this.salary = salary;
//         }
// }

//     public class Oops {
    
//         public static void main(String[] args) {
//             Company c1 = new Company("Aakansha", "software_devloper", 500000);
//             c1.printDATA();
//             Company c2 = new Company("Adarsh", "javascript_devloper", 650000);
//             c2.printDATA();
//         }
//     }


// class Student {
//     String name;
//     int  age;

//     public void printInfo() {
//         IO.println(this.name);
//         IO.println(this.age);
//     }

//     Student (Student s2){
//         this.name = s2.name;
//         this.age = s2.age;
//     }
//     Student () {

//     }

// }

// public class Oops {

//     public static void main(String[] args) {
        
//     //     Student s1 = new Student();
//     //     s1.name = "aakansha";
//     //     s1.age = 22;
       

//     //     Student s2 = new Student(s1);
//     //     // s2.name = "kajal";
//     //     // s2.age = 22;
//     //     s2.printInfo();
//     // }
// }