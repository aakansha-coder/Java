//polymorphysium has two type
// 1- overloading polymorphysim (complie tym err)
// 2 - overriding polymorphysium (run time err)


//     class Student {
//     String name;
//     int  age;

//         Student() {
//         }

//         Student(Student s2) {
//             this.name = s2.name;
//             this.age = s2.age;
//         }

//     // public void printInfo(String name) {
//     //     IO.println(name); * perameter alag nessasury 
//     // }

//     // public void printInfo(int age) {
//     //     IO.println(age);
//     // }

//     //  public void printInfo(String name, int age) {
//     //     IO.println(name  + " " + age);

//         public void printInfo(String name,  int age) {
//             IO.println(name + " " + age);
//         }

//     }

// public class Oops_polymorphysium {

//     public static void main(String[] args) {
        
//         Student s1 = new Student();
//         s1.name = "aakansha";
//         s1.age = 22;
       

//         Student s2 = new Student(s1);
//         s2.printInfo(s2.name, s2.age);
//     }
//     }


// class Student {
//     String name;
//     int age;
//     float percentage;

 
//     public void printInfo(String name, int age, float percentage) {
//         IO.println(name + " " + age + " " + percentage);
//     }

//     Student () {

//     }

//     Student(Student student) {
//         this.name = student.name;
//         this.age = student.age;
//         this.percentage = student.percentage;
//     }
// }


// public class Oops_polymorphysium {
//     public static void main(String[] args) {
//        Student s1 = new Student(); 
//         s1.name = "aakansha";
//         s1.age = 22;
//         s1.percentage = 85.2f;
        
//         s1.printInfo("aakansha", 22, 85.2f);
        
//         Student s2 = new Student(s1);
//         s2.printInfo(s2.name, s2.age, s2.percentage);

//     }
    
    
    
    
// } 


