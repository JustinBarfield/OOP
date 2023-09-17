import java.util.*;

public class Lab00101 {
    public static class DivSales {
        private int[] quarterlySales = new int[4];
        private int corporateSales;
        public DivSales(int q1, int q2, int q3, int q4) {
            quarterlySales[0] = q1;
            quarterlySales[1] = q2;
            quarterlySales[2] = q3;
            quarterlySales[3] = q4;
            
            // Calculate corporate sales by summing all quarterly sales
            corporateSales = q1 + q2 + q3 + q4;
        }

        public void subscript() {
            Scanner sub = new Scanner(System.in);
            System.out.println("Please enter the index you want to get: ");

            int index = sub.nextInt();

            while (index < 0 || index > 3) {
                System.out.println("Invalid index. Please enter an index between 0 and 3.");
                index = sub.nextInt();
            }

            System.out.println("Quarterly sales at index " + index + ": " + quarterlySales[index]);
        }

        public int getCorporateSales() {
            return corporateSales;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DivSales[] divisions = new DivSales[4];

        for (int x = 0; x < 4; x++) {
            System.out.println("Please enter the four quarterly sales for Div" + x + " separated by a space:");
            System.out.print("Enter quarterly sales separated by space (q1 q2 q3 q4): ");

            String input = scanner.nextLine();
            String[] salesStr = input.split(" ");

            int q1 = Integer.parseInt(salesStr[0]);
            int q2 = Integer.parseInt(salesStr[1]);
            int q3 = Integer.parseInt(salesStr[2]);
            int q4 = Integer.parseInt(salesStr[3]);

            divisions[x] = new DivSales(q1, q2, q3, q4);
            divisions[x].subscript();
        }

        // Calculate and display total corporate sales for all divisions
        int totalCorporateSales = 0;
        for (int x = 0; x < 4; x++) {
            totalCorporateSales += divisions[x].getCorporateSales();
        }
        System.out.println("Total Corporate Sales: " + totalCorporateSales);

        scanner.close();
    }
}