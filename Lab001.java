import java. util.*;
class Lab001 {
    private static int[] quarterlySales = new int[4]; // Define the array to store quarterly sales
what if i just turn this into the class and each object just runs this??
        public static void  quarterSalesCorporate (){
            double corporateSales = 0.0;
            for (int z = 0; z < 4; z++) {
                System.out.println("Please enter the four quarterly sales for Div" + z + "separated by a space:");
            
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        for (int x = 0; x < 4; x++) {
            quarterlySales[x] = Integer.parseInt(inputArray[x]);
            corporateSales += quarterlySales[x];
        }

        System.out.println("Quarterly sales entered in order:");
        for (int i = 0; i < 4; i++) {
            System.out.print(quarterlySales[i] + " ");
        }

        System.out.println("\nThe total sales in the corporate year is: " + corporateSales);
        
    }

        }

    public static void subscript() {
        System.out.println("Please enter the index you want to get: ");
        Scanner sub = new Scanner(System.in);
        int index = sub.nextInt();
        if (0 <= index && index <= 3) {
            System.out.println("Quarterly sales at index " + index + ": " + quarterlySales[index] );
        } else {
            System.out.println("invalid index ");
        }
    }

       public static void main(String[] args) {
        
        Lab001.quarterSalesCorporate();  
        Lab001.subscript();

        
        
       
    }
}