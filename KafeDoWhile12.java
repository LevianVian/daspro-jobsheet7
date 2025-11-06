import java.util.Scanner;

public class KafeDoWhile12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int coffee, tea, bread;
        int coffeePrice = 12000;
        int teaPrice = 7000;
        int breadPrice = 20000;
        int totalPrice;
        String customerName;
        
        do {
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            customerName = sc.nextLine();
            
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
                break;
            }
            
            System.out.print("Number of coffees: ");
            coffee = sc.nextInt();
            
            System.out.print("Number of teas: ");
            tea = sc.nextInt();
            
            System.out.print("Number of breads: ");
            bread = sc.nextInt();
            
            totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);
            
            System.out.println("Total to be paid by " + customerName + ": Rp " + totalPrice);
            
            sc.nextLine();            
        } while (true);
        
        System.out.println("All transactions completed.");
        sc.close();
    }
}