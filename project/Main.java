import java.util.Scanner;


    public static void main(String[] args) {
        //MINI PROJECT
        try (Scanner sc = new Scanner(System.in)) {
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;


        do {
            IO.println("Guess my number (1-100): ");
            userNumber = sc.nextInt();
            
            if(userNumber == myNumber) {
                IO.println("WOOHOO ... CORRECT NUMBER! ! !");
                break;
            }
            else if(userNumber > myNumber) {
                IO.println("your number is too large");
            }
            else {
                IO.println("your number is too small");
            }
        } while (userNumber != myNumber);
    }
}