import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan jumlah string yang ingin diurutkan: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] array = new String[n];
        System.out.println("\nMasukkan string:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }

        Sorting.insertionSort(array);

        System.out.println("\nArray setelah diurutkan:");
        for (String str : array) {
            System.out.print(str + " ");
        }
    }
}


