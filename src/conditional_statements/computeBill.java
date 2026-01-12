package conditional_statements;

import java.util.Scanner;

public class computeBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the units consumed by the user: ");
        int units = sc.nextInt();
        sc.close();

        int totalBill = 0;

        if (units < 0) {
            System.out.println("Please enter valid units");
        }
        else if (units <= 100) {
            totalBill = units * 1;
        }
        else if (units <= 200) {
            totalBill = (100 * 1) + (units - 100) * 2;
        }
        else if (units <= 300) {
            totalBill = (100 * 1) + (100 * 2) + (units - 200) * 3;
        }
        else {
            totalBill = (100 * 1) + (100 * 2) + (100 * 3) + (units - 300) * 5;
        }

        System.out.println("Total Bill = " + totalBill);
    }
}
