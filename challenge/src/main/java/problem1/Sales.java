package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of salespeople: ");
        int[] sales = new int[scan.nextInt()];


        for (int i=0; i<sales.length; i++) {
            int id = i+1;
            System.out.print("Enter sales for salesperson " + id + ": ");
            sales[i] = scan.nextInt();
        }


        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");

        int sum = 0;
        int maxSaleIdx = 0, minSaleIdx = 0;

        for (int i=0; i<sales.length; i++) {
            int id = i+1;
            System.out.println(" " + id + " " + sales[i]);
            sum += sales[i];

            if (sales[i] > sales[maxSaleIdx]) maxSaleIdx = i;
            if (sales[i] < sales[minSaleIdx]) minSaleIdx = i;
        }

        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sale: " + (float)sum/sales.length);
        System.out.println("\nSalesperson " + (maxSaleIdx+1) + " had the highest sale with $" + sales[maxSaleIdx]);
        System.out.println("Salesperson " + (minSaleIdx+1) + " had the lowest sale with $" + sales[minSaleIdx]);

        System.out.print("\nEnter a sales value: ");
        int userVal = scan.nextInt();
        int overCount = 0;

        for (int i = 0; i < sales.length; i++) {
            int id = i+1;
            if (sales[i] > userVal) {
                System.out.println("Salesperson " + id + "'s sale exceeded your value ($" + sales[i] + ")");
                overCount++;
            } 
        }

        System.out.println("\nNumber of salespeople whose sales exceeded your value: " + overCount);

        scan.close();
    }
}
