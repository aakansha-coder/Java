import java.util.Scanner;

public class Loops {
 void main ()   {
    // IO.println("1");
    // IO.println("2");
    // IO.println("3");

    //1-100
    //100-1
    //a to z

    // for(char ch = 'a'; ch <= 'z';   ch++) {
    //     IO.println(ch);
    // }

    //   String[] days = {"monday", "tuesday", "wednesday", "thursday", 
    //                     "frinday", "saturday", "sunday"
    //   };

    //   for()

    //while loop
    //100-1
    // int j = 100;
    // while(j >= 1){
    //     IO.println(j);
    //     j = j - 1;
    // }

    // //Do while

    // int k = 100;
    // do {
    //     IO.println(k);
    //     k = k - 1;

    // } while(k >= 1);

    try (Scanner sc = new Scanner(System.in)) {
        int number = 0;
        do {
            IO.println("input a number");
            number = sc.nextInt();
            System.out.print("here is your number : ");
            IO.println(number);

        } while (number >= 0);
    }

    IO.println("THE END");


 }
}
