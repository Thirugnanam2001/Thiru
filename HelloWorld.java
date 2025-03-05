import java.util.Scanner;

public class HelloWorld {
    //main method or main function
    public static void main(String[] args) {

//        int i, j, k = 5;  // k is given as 5
//
//        for (i = 0; i < k; i++) {  // Loop for rows
//            for (j = 0; j < k; j++) {  // Loop for columns
//                System.out.print(Math.max(k - j, k - i));  // Printing numbers
//            }
//            System.out.println();  // New line after each row
//
//        }
//        Scanner scanner = new Scanner(System.in);
//
//        // Taking input from the user
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        // Checking if the number is positive or negative
//        if (number >= 0) {
//            System.out.println("Positive");
//        } else {
//            System.out.println("Negative");
//        }
//
//        scanner.close();


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//
//        int reversedNum = 0;
//
//        while (num != 0) {
//
//            int lastDigit = num % 10;
//
//            reversedNum = reversedNum * 10 + lastDigit;
//
//            num = num / 10;
//        }
//
//        System.out.println("Reversed number: " + reversedNum);
//
//        scanner.close();




                // Create a Scanner object to get input from the user
//                Scanner scanner = new Scanner(System.in);
//                // Prompt the user to enter three numbers
//                System.out.print("Enter the first number: ");
//                int num1 = scanner.nextInt();
//                System.out.print("Enter the second number: ");
//                int num2 = scanner.nextInt();
//                System.out.print("Enter the third number: ");
//                int num3 = scanner.nextInt();
//                // Initialize the smallest number to be num1
//                int smallest = num1;
//                // Compare with the second number
//                if (num2 < smallest) {
//                    smallest = num2;
//                }
//                if (num3 < smallest) {
//                    smallest = num3;
//                }
//                System.out.println("The smallest number is: " + smallest);
//                scanner.close();



                // Create a Scanner object to get input from the user
                Scanner scanner = new Scanner(System.in);
                // Prompt the user to enter the purchase amount
                System.out.print("Enter the purchase amount: ");
                double purchaseAmount = scanner.nextDouble();
                // Initialize the discount variable
                double discount = 0;
                // Apply the appropriate discount based on the purchase amount
                if (purchaseAmount < 500) {
                    // No discount if amount is less than 500
                    discount = 0;
                } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
                    // 10% discount if amount is between 500 and 1000
                    discount = 0.10;
                } else if (purchaseAmount > 1000) {
                    // 20% discount if amount is greater than 1000
                    discount = 0.20;
                }
                // Calculate the final payable amount after discount
                double discountAmount = purchaseAmount * discount;
                double finalAmount = purchaseAmount - discountAmount;
                // Output the final payable amount after discount
                System.out.println("The discount applied is: " + (discount * 100) + "%");
                System.out.println("The final payable amount is: " + finalAmount);

                // Close the scanner
                scanner.close();



    }

}


























