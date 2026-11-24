// interface Blanket {
//     int num = 1;
//     public void over();
// }

// class Woolen implements Blanket {
//     public void over() {
//         IO.println("cover with woolen blanket");
//     }
// }

// public class Oops_interfaces {
//     public static void main(String[] args) {
//         Woolen woolen = new Woolen();
//         woolen.over();
//     }
// }


// interface Cloth {
//     public void wash();
// }

// class Dress implements Cloth {
//     public void wash() {
//         IO.println("cloths wash with the help of housemaid");
//     }
// }

// public class Oops_interfaces {
//     public static void main(String[] args) {
//         Dress dress = new Dress();
//         dress.wash();
        
//     }
// }

// interface Book {
//     public void study();
// }

// class Teach implements Book {
//     public void study() {
//         IO.println("Teacher teach a students");
//     }
// }

//  public class Oops_interfaces {
//     public static void main(String[] args) {
//         Teach teach = new Teach();
//         teach.study();
//     }
// }



// interface Aakansha {
//     public void eats();
// }

// class Humans implements Aakansha {
//     public void eats () {
//         IO.println("humans eats pizza");
//     }
// }

// public class Oops_interfaces {
//     public static void main(String[] args) {
//         Humans humans = new Humans();
//         humans.eats();
//     }
// }

// interface Animal {
//     public void walk();
// }

// interface Herbivore {

// } //multiple inheritance

// class Horse implements Animal, Herbivore {
//     public void walk() {
//         IO.println("walk on 4 legs");
//     }
// }
// public class Oops_interfaces {
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         horse.walk();
//     }
// }


// interface Company {
//     public void work();
// }

// class Employee implements Company {
//     public void work() {
//          IO.println("employees are work here");
//     }
    
// }

// public class Oops_interfaces {
//     public static void main(String[] args) {
//         Employee e1 = new Employee();
//         e1.work();
//     }
// }


interface Animal {
    public void sound();
}

class Dog implements Animal {
    public void sound(){
        IO.println("dog barks");
    }
}

 public class Oops_interfaces {
    public static void main(String[] args) {
        // Dog d1 = new Dog();
        Animal a1 = new Dog();
        a1.sound();
    }
 }
