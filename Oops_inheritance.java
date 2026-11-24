// import java.util.*;

class bank {
   static class Account {
      public String name;
   }
}



//extends se property inherite hot h main (extends)
//inheriatnce has four type 
// . single level
// .  deliverd class


class Shape {
   public void aera() {
      IO.println("display area");
   }
}

class triangle extends Shape {
   public  void area(int l, int h) {
      IO.println(1/2*l*h);
   }
}

class Circle extends  Shape {
   public void area(int r) {
      IO.println((3.14)*r*r);
   }
 }

public class Oops_inheritance {
    
    public static void main(String[] args) {
      bank.Account account1 = new bank.Account();
      account1.name = "customer1";
        
    }
    
}



//  public class Oops_inheritance {
    
//     public static void main(String[] args) {
//        triangle t1 = new triangle(); 
//        t1.color = "red";
//     }
//  }

// class Shape {
//     String color;
// }

// class triangle extends Shape {

// }

//  public class Oops_inheritance {
    
//     public static void main(String[] args) {
//        triangle t1 = new triangle(); 
//        t1.color = "red";
//     }
//  }


 //single inheritance

// class Shape {
//     public void area() {
//         IO.println("display area");
//     }
// }

// class Triangle extends Shape {
//     public void area(int r) {
//         IO.print((3.14)*r*r);
//     }
// }

// public class Oops_inheritance {
    
//     public static void main(String[] args) {
        
//     }
    
// }
