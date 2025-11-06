import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final double TICKET_PRICE = 50000;
        int totalTicketsSold = 0;
        double totalSales = 0;
        String choice;
        
        System.out.println("Cinema Ticket Sales Program");
        
        while (true) {
            System.out.print("Enter number of tickets purchased (or type 'stop' to finish): ");

            if (input.hasNextInt()) {
                int tickets = input.nextInt();
                
                if (tickets < 0) {
                    System.out.println("Invalid ticket amount! Please enter a positive number.");
                    continue;
                }
                
                double discount = 0;
                if (tickets > 10) {
                    discount = 0.15;
                } else if (tickets > 4) {
                    discount = 0.1;
                }
                
                double totalPrice = tickets * TICKET_PRICE * (1 - discount);
                
                totalTicketsSold += tickets;
                totalSales += totalPrice;
                
                System.out.printf("Tickets purchased: %d | Discount: %.0f%% | Total price: Rp %.2f%n",
                                  tickets, discount * 100, totalPrice);
            } 
            else {
                // Jika bukan angka, baca sebagai string
                choice = input.next();
                if (choice.equalsIgnoreCase("stop")) {
                    break; // keluar dari loop
                } else {
                    System.out.println("Invalid input! Please enter a number or 'stop'.");
                }
            }
        }
        
        System.out.println("\nDaily Sales Ticket Summary");
        System.out.println("Total tickets sold: " + totalTicketsSold);
        System.out.printf("Total ticket sales: Rp %.2f%n", totalSales);
        
        input.close();
    }
}
