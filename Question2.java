/* This program will output the values of sales tax in Quebec, tips of 15% and 
 * total amount that should be paid by the user.
 */
package question2;

import java.util.Scanner;

/**
 * @author Pauline Chicoye
 */
public class Question2 {
    
    public static void main(String[] args) {
        Scanner priceObj = new Scanner(System.in);
        System.out.println("The price of the product in CAD: ");
        double priceProduct = priceObj.nextDouble();
        
        double tpsTax = 0.05;
        double tvqTax = 0.09975;
        double taxQc = tpsTax + tvqTax;
        double tips = 0.15;
        double totalPrice = (priceProduct * taxQc) + (priceProduct*tips) + priceProduct;
        
        System.out.println("The value of TPS tax in Quebec is: " + tpsTax);
        System.out.printf("The value of TVQ tax in Quebec is: %.2f", tvqTax);
        System.out.printf("\nThe value of total tax(TPS+TVQ) in Quebec is: %.2f", taxQc);
        System.out.printf("\nThe value of tips are: %.2f", tips);
        System.out.println("\n---------------------------------------");
        System.out.printf("The total amount that should be paid is: %.2f", totalPrice);
        
        
        
        
    }
    
}
