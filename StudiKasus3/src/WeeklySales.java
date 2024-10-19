import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of salespeople: ");
        int numSalesPeople = scanner.nextInt();
        scanner.nextLine(); 

        SalesPerson[] salesStaff = new SalesPerson[numSalesPeople];

        for (int i = 0; i < salesStaff.length; i++) {
            System.out.print("Enter first name for SalesPerson " + (i + 1) + ": ");
            String firstName = scanner.nextLine();
            System.out.print("Enter last name for SalesPerson " + (i + 1) + ": ");
            String lastName = scanner.nextLine();
            System.out.print("Enter total sales for SalesPerson " + (i + 1) + ": ");
            int totalSales = scanner.nextInt();
            scanner.nextLine(); 
            
            salesStaff[i] = new SalesPerson(firstName, lastName, totalSales);
        }

        Sorting.insertionSort(salesStaff);
        System.out.println("\nRanking of Sales for the week\n");
        
        for (SalesPerson s : salesStaff) {
            System.out.println(s);
        }
        scanner.close();
    }
}
