import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int number ;

        System.out.print("Enter the number : ");
        number = s.nextInt();
        s.close();
        boolean prime = true;

        if (number == 1) {
            System.out.println("The entered number is not a prime number!");
        } else {
            for ( int i = 2 ; i <= number / 2 ; i ++ ) {
                if ( number % i == 0 ) {
                    prime = false;
                    break;
                }
            }
            
        }
        if(prime) {
            System.out.println("Entered number is a prime number !");
        } else {
            System.out.println("The entered number is not a prime number!");
        }
    }
}