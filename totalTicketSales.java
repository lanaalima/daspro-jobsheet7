import java.util.Scanner;

public class totalTicketSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticketPrice = 50000;
        int totalTicketsSold = 0;
        double totalRevenue = 0;

        while (true) {
            System.out.print("Enter the number of tickets bought by the customer (0 to finish): ");
            int tickets = sc.nextInt();

            if (tickets < 0) {
                System.out.println("Invalid input. Please re-enter!");
                continue;
            }

            if (tickets == 0) {
                break;
            }

            totalTicketsSold += tickets;

            if (tickets > 10) {
                totalRevenue += tickets * ticketPrice * 0.85; // 15% discount
            } else if (tickets > 4) {
                totalRevenue += tickets * ticketPrice * 0.90; // 10% discount
            } else {
                totalRevenue += tickets * ticketPrice;
            }
        }

        System.out.println("Total tickets sold: " + totalTicketsSold);
        System.out.println("Total sales: Rp " + totalRevenue);
    }
}