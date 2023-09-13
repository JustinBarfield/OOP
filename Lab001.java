class Lab001 {
   

        public static void  quarterSalesCorporate (){
            private static double corporateSales = 0.0;
            Scanner scanner = new Scanner(System.in);
            int[] integers = new int[4];
            int sum = 0;
            String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        for (int x = 0; i < 4; x++) {
            integers[x] = Integer.parseInt(inputArray[x]);
            corporateSales += integers[x];
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(integers[i] + " ");
        }

        System.out.println("The total sales in the corporate year is : " + corporateSales );
         
        }
            
            
        
    

        public static int subscript(int index){
             if( 0 <= index && index <=3 )
            return quarterSales[index];
            else{
                return -1;
            }
        }

        public static void main(String[] args){
            System.out.println("Please enter the four quarterly sales for Div 0 separated by a space:");
            Lab001.quarterSalesCorporate();
            
           
            System.out.println(table of info);
            
        }

    }
