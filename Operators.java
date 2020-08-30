import java.util.Scanner;

class Operators {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        String ans;
        while (choice != 4) {
        System.out.println("Choose from the below operations :");
        System.out.print("1. Bitwise Operations \n" +
                         "2. Logical Operations \n" + 
                         "3. Relational Operations\n" + 
                         "4. Exit \n");
        System.out.print("Enter your choice : ");
        choice = s.nextInt();
        System.out.println("\n");
        switch(choice) {
            case 1 :
                ans = performBitwiseOperations();
                System.out.println(ans + "\n");
                 break ;
            case 2 :
                ans = performLogicalOperations();
                System.out.println(ans + "\n");
                break;
            case 3 :
                ans = performRelationalOperations();
                System.out.println(ans + "\n");
                break;
            case 4 :
                System.exit(0);
            default:
                System.out.println("Invalid Input!");
                break;
        }
        
    }

    }

    private static String performBitwiseOperations() {
        System.out.println("You chose  Bitwise Operations");
        System.out.println("\n");
        int choice , a , b;
        System.out.print("Enter the first number : ");
        a = s.nextInt();
        System.out.print("Enter the second number : ");
        b = s.nextInt();
        System.out.println("\n");
        System.out.println("Choose from the below Bitwise operations :");
        System.out.print("1. Bitwise OR \n" +
                         "2. Bitwise AND\n" + 
                         "3. Bitwise XOR\n" + 
                         "4. Bitwise Complement\n" + 
                         "5. Signed Left Shift\n" + 
                         "6. Signed Right Shift\n" + 
                         "7. All\n" );
        System.out.print("Enter your choice : ");
        choice = s.nextInt();
        System.out.println("\n");
        switch(choice) {
            case 1 : 
                return ("a | b = " + (a | b) );                
            case 2 : 
                return ("a & b = " + (a & b) );                
            case 3 : 
                return ("a ^ b = " + (a ^ b) );
            case 4 :
                return("~ a = " + ~a + "\n" + "~ b = " + ~b);
            case 5 : 
                return("a << 1 = " + (a << 1) + "\n" + "b << 1= " + (b << 1));
            case 6 : 
                return("a >> 1 = " + (a >> 1) + "\n" + "b >> 1= " + (b >> 1));
            case 7 : 
                return("a | b = " + (a | b) +"\n"+ 
                       "a & b = " + (a & b) +"\n" + 
                       "a ^ b = " + (a ^ b) +"\n" +
                       "~ a = " + ~a + "\n" + "~ b = " + ~b + "\n" +
                       "a << 1 = " + (a << 1) + "\n" + "b << 1= " + (b << 1) + "\n" +
                       "a >> 1 = " + (a >> 1) + "\n" + "b >> 1= " + (b >> 1) + "\n");
            default :
                return ("Invalid Input !");     
        }
    }

    private static String  performLogicalOperations() {
        System.out.println("You chose Logical Operations");
        System.out.println("\n");
        int choice;
        boolean a = true;
        boolean b = false;
        System.out.println("Choose from the below Logical operations :");
        System.out.print("1. Logical OR \n" +
                         "2. Logical AND\n" +
                         "3. All\n");
        System.out.print("Enter your choice : ");
        choice = s.nextInt();
        System.out.println("\n");
        System.out.println("Let a = True \nLet b = False");
        switch(choice) {
            case 1 : 
                return ("a && b = " + (a && b) );                
            case 2 : 
                return ("a || b = " + (a || b) ); 
            case 3 :
                return ("a && b = " + (a && b) + "\n" +
                        "a || b = " + (a || b) + "\n");               
            default :
                return ("Invalid Input !");     
        }

    }

    private static String performRelationalOperations() {
        System.out.println("You chose Relational operations");
        System.out.println("\n");
        int choice , a , b;
        System.out.print("Enter the first number : ");
        a = s.nextInt();
        System.out.print("Enter the second number : ");
        b = s.nextInt();
        System.out.println("\n");
        System.out.println("Choose from the below Relational operations :");
        System.out.print("1. Greater Than (>)\n" +
                         "2. Less Than (<)\n" + 
                         "3. Greater Than or Equal To (>=)\n" + 
                         "4. Less Than or Equal To (<=)\n" + 
                         "5. Is Equal To (==)\n" + 
                         "6. Is Not Equal To (!=)\n" + 
                         "7. All\n");
        System.out.print("Enter your choice : ");
        choice = s.nextInt();
        System.out.println("\n");
        switch(choice) {
            case 1 : 
                return ("(a > b) = " + (a > b) );                
            case 2 : 
                return ("(a < b) = " + (a < b) );                
            case 3 : 
                return ("(a >= b) = " + (a >= b) );
            case 4 :
                return("(a <= b) =  " + (a <= b));
            case 5 : 
                return("(a == b) = " + (a == b));
            case 6 : 
                return("(a != b) = " +(a != b));
            case 7 : 
                return("(a > b) = " + (a > b) + "\n" +
                       "(a < b) = " + (a < b) + "\n" + 
                       "(a >= b) = " + (a >= b) + "\n" +
                       "(a <= b) =  " + (a <= b) + "\n" + 
                       "(a == b) = " + (a == b) + "\n" +
                       "(a != b) = " +(a != b) + "\n");
            default :
                return ("Invalid Input !");     
        }
    }
    
}