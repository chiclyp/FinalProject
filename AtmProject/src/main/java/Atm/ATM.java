package Atm;

import java.util.Scanner;

/**
 *
 * @author Pauline Chicoye
 */
public class ATM {
    
    public static void main(String[] args) {
       Account details = new Account(1000.00);
       
        System.out.println("Hello. Welcome to your virtual ATM machine.");
        System.out.println("Let's start by having you provide your full name");
        
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        
        System.out.println("Welcome back " + name + " What is your nip?");
        
        int nip = scan.nextInt();
    }
    
}

